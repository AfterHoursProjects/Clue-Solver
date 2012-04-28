package rest;

import org.restlet.Application;
import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

/**
 * @author matt
 * 
 */
public class ClueRestService extends Application {

	public ClueRestService(final Context context) {
		super(context);
		getTunnelService().setEnabled(true);
		getTunnelService().setExtensionsTunnel(true);
		getConverterService().setEnabled(true);
	}

	@Override
	public Restlet createInboundRoot() {
		final Router router = new Router(getContext());
		router.attach("/status", StatusResource.class);
		router.attach("/cards", CardsResource.class);
		return super.createInboundRoot();
	}
}
