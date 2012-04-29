package rest;

import org.restlet.Component;
import org.restlet.Context;
import org.restlet.data.Protocol;

/**
 * @author matt
 * 
 */
public class ClueServer {

	public static void main(final String args[]) throws Exception {
		final Component component = new Component();
		component.getServers().add(Protocol.HTTP, 1778);
		final Context childContext = component.getContext().createChildContext();

		component.getDefaultHost().attach("/clue", new ClueRestService(childContext));
		component.start();

		Thread.currentThread().wait();
	}
}
