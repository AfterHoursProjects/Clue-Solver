package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import main.ClueGameFactory;
import model.Card;
import service.ClueSessionService;

/**
 * Interactions with the rule engine based on cards
 * 
 * @author matt
 * 
 */
@Path("cards")
public class CardsResource {
	@Context
	SecurityContext security;

	/**
	 * Inserts a card into the rule session
	 * 
	 * @param toInsert
	 *            the Card to be inserted into the rule session
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public void insertCard(final Card toInsert) {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		game.eliminateCard(toInsert);
	}
}
