package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.rest.ClueServerStatus;
import service.ClueSessionService;

/**
 * @author matt
 * 
 */
@Path("status")
public class StatusResource {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public ClueServerStatus status() {
		final ClueSessionService game = ClueGameFactory.getGameForUser("matt");

		final ClueServerStatus status = new ClueServerStatus();
		status.setRemainingTriples(game.getPossibilities());
		status.setRemainingCards(game.getRemainingCards());

		return status;
	}
}
