package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import model.Card;

import org.restlet.resource.ServerResource;

/**
 * @author matt
 * 
 */
@Path("cards")
public class CardsResource extends ServerResource {

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public void insertCard(final Card toInsert) {

	}
}
