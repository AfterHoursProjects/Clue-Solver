package rest;

import model.rest.ClueServerStatus;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import service.ClueSessionService;

/**
 * @author matt
 * 
 */
public class StatusResource extends ServerResource {
	@Get("json|xml")
	public ClueServerStatus status() {
		final ClueSessionService game = ClueGameFactory.getGameForUser("matt");

		final ClueServerStatus status = new ClueServerStatus();
		status.setRemainingTriples(game.getPossibilities());
		status.setRemainingCards(game.getRemainingCards());

		return status;
	}
}
