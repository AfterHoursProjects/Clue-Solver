package rest;

import org.restlet.Component;
import org.restlet.Context;
import org.restlet.data.Protocol;

/**
 * @author matt
 * 
 */
public class ClueRestServer {

	public static void main(final String args[]) {
		final Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8080);
		final Context childContext = component.getContext().createChildContext();

		component.getDefaultHost().attach("/clue", new ClueService(childContext));
		component.start();
		while (true) {
			Thread.sleep(10000);
		}
	}
}
