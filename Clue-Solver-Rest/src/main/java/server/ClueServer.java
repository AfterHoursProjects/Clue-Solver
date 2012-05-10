package server;

import java.util.Set;

import org.restlet.Component;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Protocol;
import org.restlet.ext.jaxrs.JaxRsApplication;
import org.restlet.security.ChallengeAuthenticator;
import org.restlet.security.Verifier;

import restlets.ClueRestService;

import com.google.common.collect.ImmutableSet;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import events.ServerSignals;

/**
 * @author matt
 * 
 */
public class ClueServer {
	private final Component component;
	private Set<String> authorizedUsers = ImmutableSet.of("matt", "bobby");
	private EventBus eventBus; 
	
	@Subscribe
	public void onStop(ServerSignals.StopSignal signal) {
		try {
			eventBus.unregister(this);
			this.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ClueServer(final int port, final EventBus eventBus) {
		component = new Component();
		component.getServers().add(Protocol.HTTP, port);
		
		final Context childContext = component.getContext().createChildContext();
		
		final JaxRsApplication application = new JaxRsApplication(childContext);
		application.getTunnelService().setExtensionsTunnel(true);
		application.getConverterService().setEnabled(true);
		application.add(new ClueRestService());

		final ChallengeAuthenticator authenticator = new ChallengeAuthenticator(application.getContext(),
				ChallengeScheme.HTTP_BASIC, null);
		authenticator.setVerifier(new Verifier() {

			@Override
			public int verify(final Request request, final Response response) {
				if (request.getChallengeResponse() == null) {
					return RESULT_MISSING;
				}

				if (!authorizedUsers.contains((request.getChallengeResponse().getIdentifier()))) {
					return RESULT_INVALID;
				}
				return RESULT_VALID;
			}
		});
		application.setGuard(authenticator);

		component.getDefaultHost().attach("/clue", application);
	}

	public void start() throws Exception {
		component.start();
	}

	public void stop() throws Exception {
		component.stop();
	}
}
