package rest;

import model.Card;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.Response;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;

import server.ClueServer;
import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

/**
 * @author matt
 * 
 */
public class ClueServerTest {
	public static ClueServer server;
	private static final int port = 6110;

	@BeforeClass
	public static void startTestServer() throws Exception {
		server = new ClueServer(port);
		server.start();

	}

	@AfterClass
	public static void stopTestServer() throws Exception {
		// Wait for all output to finish
		synchronized (Thread.currentThread()) {
			Thread.currentThread().wait(1000);
		}

		server.stop();
	}

	private ChallengeResponse getChallengeResponse() {
		final ChallengeResponse response = new ChallengeResponse(ChallengeScheme.HTTP_DIGEST);
		response.setRealm("clueRealm");
		response.setIdentifier("matt");
		response.setSecret("abc");
		return response;
	}

	@Test
	public void testPutCard() throws Exception {
		final Client client = new Client(Protocol.HTTP);
		final Reference reference = new Reference("http://localhost/clue/cards");
		reference.setHostPort(port);
		final Request request = new Request(Method.PUT, reference);
		request.setChallengeResponse(getChallengeResponse());

		final Card card = WeaponEnum.LEADPIPE.getWeapon();

		request.setEntity(new JacksonRepresentation<Card>(card));
		System.out.println(request.getEntityAsText());
		client.handle(request);
	}

	@Test
	public void testPutTriple() throws Exception {
		final Client client = new Client(Protocol.HTTP);
		final Reference reference = new Reference("http://localhost/clue/triples");
		reference.setHostPort(port);
		final Request request = new Request(Method.PUT, reference);
		request.setChallengeResponse(getChallengeResponse());

		final Weapon weapon = WeaponEnum.CANDLESTICK.getWeapon();
		final Suspect suspect = SuspectEnum.PEACOCK.getSuspect();
		final Room room = RoomEnum.BILLIARDROOM.getRoom();

		request.setEntity(new JacksonRepresentation<Triple>(new Triple(room, suspect, weapon)));
		System.out.println(request.getEntityAsText());
		client.handle(request);
	}

	@Test
	public void testServerGetStatus() throws Exception {
		final Client client = new Client(Protocol.HTTP);
		Reference reference = new Reference("http://localhost/clue/status.xml");
		reference.setHostPort(port);
		Request request = new Request(Method.GET, reference);
		request.setChallengeResponse(getChallengeResponse());

		Response response = client.handle(request);
		// System.out.println(response.getEntityAsText());

		reference = new Reference("http://localhost/clue/status.json");
		reference.setHostPort(port);
		request = new Request(Method.GET, reference);
		request.setChallengeResponse(getChallengeResponse());

		response = client.handle(request);
		System.out.println(response.getEntityAsText());
	}
}
