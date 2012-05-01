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
import enums.WeaponEnum;

/**
 * @author matt
 * 
 */
@Path("cards")
public class CardsResource {

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
	public void insertCard(final Card toInsert, @Context final SecurityContext security) {
		final ClueSessionService game = ClueGameFactory.getGameForUser(security.getUserPrincipal().getName());
		if (!WeaponEnum.LEADPIPE.getWeapon().equals(toInsert)) {
			throw new RuntimeException("Equals fail");
		}
		game.eliminateCard(toInsert);
	}
}
