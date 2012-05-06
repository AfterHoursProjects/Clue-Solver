package rest;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import model.Card;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;
import model.rest.ClueServerStatus;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.restlet.Client;
import org.restlet.Request;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.data.Method;
import org.restlet.data.Protocol;
import org.restlet.data.Reference;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.resource.ClientResource;

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
	private static final Integer port = Integer.valueOf(6110);

	@BeforeClass
	public static void startTestServer() throws Exception {
		server = new ClueServer(port.intValue());
		server.start();

	}

	@AfterClass
	public static void stopTestServer() throws Exception {
		// Wait for all output to finish
		System.out.flush();
		server.stop();
	}

	private ChallengeResponse getChallengeResponse() {
		final ChallengeResponse response = new ChallengeResponse(ChallengeScheme.HTTP_BASIC);
		response.setIdentifier("matt");
		response.setSecret("abc");
		return response;
	}

	private int getRemainingCount() {
		Reference reference = new Reference("http://localhost/clue/game.json");
		reference.setHostPort(port);

		ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());

		ClueServerStatus response = resource.get(ClueServerStatus.class);
		return response.getRemainingTriples().size();
	}

	@Before
	public void resetForTest() {
		resetGame();
	}

	private void resetGame() {
		Reference reference = new Reference("http://localhost/clue/game");
		reference.setHostPort(port);

		ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());
		resource.delete();

		assertEquals(324, getRemainingCount());
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

		assertEquals(270, getRemainingCount());
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

		assertEquals(323, getRemainingCount());
	}

	@Test
	public void testServerGetStatus() throws Exception {
		Reference reference = new Reference("http://localhost/clue/game.xml");
		reference.setHostPort(port);

		ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());

		ClueServerStatus response = resource.get(ClueServerStatus.class);
		assertNotNull(response);
	}
}
