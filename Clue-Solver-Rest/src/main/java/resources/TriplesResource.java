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
import model.Triple;
import model.TripleList;
import service.ClueSessionService;

/**
 * Api resources for interacting with triples, currently its only function is to allow insertion of a triple which will
 * eliminate it from the possible triples that would win
 * 
 * @author matt
 * 
 */
@Path("triples")
public class TriplesResource {
	@Context
	private SecurityContext security;

	/**
	 * Put a {@link Triple} into the game session
	 * 
	 * @param toInsert
	 *            The triple that is to be inserted, this can be either JSON or XML
	 */
	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public void insertCard(final Triple toInsert) {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		game.eliminateTriple(toInsert);
	}
	
	/**
	 * Returns a list of the remaining triples, if none are left an empty list will 
	 * be returned
	 * @return all remaining triples
	 */
	@GET
	@Path("remaining")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	public TripleList remaining() {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		return game.getPossibilities();
	}
	
}
