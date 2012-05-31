package rest;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import model.Card;
import model.Room;
import model.Suspect;
import model.Triple;
import model.TripleList;
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

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

import dependency.injection.RestModule;
import dependency.injection.TestModule;
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
		final Injector injector = Guice.createInjector(Modules.override(new RestModule()).with(new TestModule()));
		server = injector.getInstance(ClueServer.class);
		server.start();

	}

	@AfterClass
	public static void stopTestServer() throws Exception {
		server.stop();
	}

	private ChallengeResponse getChallengeResponse() {
		final ChallengeResponse response = new ChallengeResponse(ChallengeScheme.HTTP_BASIC);
		response.setIdentifier("matt");
		response.setSecret("abc");
		return response;
	}

	private int getRemainingCount() {
		final Reference reference = new Reference("http://localhost/clue/game.json");
		reference.setHostPort(port);

		final ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());

		final ClueServerStatus response = resource.get(ClueServerStatus.class);
		resource.release();
		return response.getRemainingTriples().size();
	}

	@Before
	public void resetForTest() {
		resetGame();
	}

	private void resetGame() {
		final Reference reference = new Reference("http://localhost/clue/game");
		reference.setHostPort(port);

		final ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());
		resource.delete();
		resource.release();

		assertEquals(324, getRemainingCount());
	}

	@Test
	public void testPutCard() throws Exception {
		final Reference reference = new Reference("http://localhost/clue/cards");
		reference.setHostPort(port);

		final ClientResource client = new ClientResource(reference);
		client.setChallengeResponse(getChallengeResponse());

		final Card card = WeaponEnum.LEADPIPE.getWeapon();
		client.put(new JacksonRepresentation<Card>(card));
		client.release();

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
		final Reference reference = new Reference("http://localhost/clue/game.xml");
		reference.setHostPort(port);

		final ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());

		final ClueServerStatus response = resource.get(ClueServerStatus.class);
		resource.release();

		assertNotNull(response);
	}
	
	@Test
	public void testRemainingTriples() {
		final Reference reference = new Reference("http://localhost/clue/triples/remaining.json");
		reference.setHostPort(port);
		
		final ClientResource resource = new ClientResource(reference);
		resource.setProtocol(Protocol.HTTP);
		resource.setChallengeResponse(getChallengeResponse());
		
		final TripleList response = resource.get(TripleList.class);
		resource.release();
		
		assertNotNull(response);
		assertEquals(324, response.size());
	}
}
