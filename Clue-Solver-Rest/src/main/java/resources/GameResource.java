package resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import main.ClueGameFactory;
import model.rest.ClueServerStatus;
import service.ClueSessionService;

/**
 * Used to interact with the game in general, this includes things such as getting the {@link #status(SecurityContext)}
 * of the game, which includes things such as the most likely triple set and the total remaining triples to be
 * eliminated
 * 
 * @author matt
 * 
 */
@Path("game")
public class GameResource {

	@Context
	private SecurityContext security;

	/**
	 * Resets the game back to having no cards inserted into its facts and regenerates all triples
	 * 
	 * @param security
	 */
	@DELETE
	public void resetGame() {
		ClueGameFactory.resetGameForUser(security.getUserPrincipal().getName());
	}

	/**
	 * Retrieves the current status of the game, this can produce both JSON and XML depending on your needs
	 * 
	 * @return the {@link ClueServerStatus} of the users current session
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public ClueServerStatus status() {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());

		final ClueServerStatus status = new ClueServerStatus();
		status.setRemainingTriples(game.getPossibilities());

		return status;
	}
}
