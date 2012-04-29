package rest;

import org.restlet.Component;
import org.restlet.Context;
import org.restlet.data.Protocol;
import org.restlet.ext.jaxrs.JaxRsApplication;

/**
 * @author matt
 * 
 */
public class ClueServer {

	public static void main(final String args[]) throws Exception {
		final Component component = new Component();
		component.getServers().add(Protocol.HTTP, 1778);
		final Context childContext = component.getContext().createChildContext();

		final JaxRsApplication application = new JaxRsApplication(childContext);

		component.getDefaultHost().attach(application);
		component.start();

		Thread.currentThread().wait();
	}
}
