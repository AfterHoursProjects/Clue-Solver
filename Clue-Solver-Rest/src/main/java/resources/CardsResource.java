package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import main.ClueGameFactory;
import model.Card;
import model.rest.CardCounts;
import service.ClueSessionService;
import service.probability.ProbabilityCalculator;

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
	private ProbabilityCalculator calculator;

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public CardCounts getProbabilities() {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		game.getPossibilities();
		return null;
	}

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
