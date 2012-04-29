package rest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.Client;
import org.restlet.Component;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;

/**
 * @author matt
 * 
 */
public class ClueServerTest {
	public static Component component;

	@BeforeClass
	public static void startTestServer() throws Exception {
		component = new Component();
		component.getServers().add(Protocol.HTTP, 1778);
		final Context childContext = component.getContext().createChildContext();

		component.getDefaultHost().attach("/clue", new ClueRestService(childContext));
		component.start();
	}

	@AfterClass
	public static void stopTestServer() throws Exception {
		component.stop();
	}

	@Test
	public void testServerMain() throws Exception {
		final Client client = new Client(Protocol.HTTP);
		Reference reference = new Reference("http://localhost:1778/clue/status.xml");
		Request request = new Request(Method.GET, reference);

		Response response = client.handle(request);
		System.out.println(response.getEntityAsText());

		reference = new Reference("http://localhost:1778/clue/status.json");
		request = new Request(Method.GET, reference);

		response = client.handle(request);
		System.out.println(response.getEntityAsText());
	}
}
