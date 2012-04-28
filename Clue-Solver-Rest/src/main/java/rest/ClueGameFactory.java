package rest;

import java.util.HashMap;
import java.util.Map;

import service.ClueSessionService;

/**
 * @author matt
 * 
 */
public class ClueGameFactory {
	private static final Map<String, ClueSessionService> currentGames = new HashMap<String, ClueSessionService>();

	public static ClueSessionService getGameForUser(final String name) {
		ClueSessionService game = currentGames.get(name);
		if (game == null) {
			game = new ClueSessionService();
		}
		return game;
	}
}
