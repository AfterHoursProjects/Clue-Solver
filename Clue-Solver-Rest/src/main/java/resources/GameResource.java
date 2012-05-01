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
 * @author matt
 * 
 */
@Path("game")
public class GameResource {

	@DELETE
	public void resetGame(@Context final SecurityContext security) {
		ClueGameFactory.resetGameForUser(security.getUserPrincipal().getName());
	}

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public ClueServerStatus status(@Context final SecurityContext security) {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());

		final ClueServerStatus status = new ClueServerStatus();
		status.setRemainingTriples(game.getPossibilities());

		return status;
	}
}
