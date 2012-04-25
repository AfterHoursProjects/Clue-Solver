package service;

import static org.junit.Assert.assertTrue;
import model.Card;
import model.Triple;

import org.junit.Test;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class ClueSessionServiceTest {

	@Test
	public void testEliminateCard() {
		Card mustard = SuspectEnum.MUSTARD.getSuspect();
		ClueSessionService service = new ClueSessionService();
		service.eliminateCard(mustard);
		System.out.println("Done with first elimination");
		service.eliminateCard(mustard);
		assertTrue(service.getPossibilities().size() == Integer.valueOf(270));
	}

	@Test
	public void testEliminateTriple() {
		Triple triple = new Triple(RoomEnum.CONSERVATORY.getRoom(), SuspectEnum.MUSTARD.getSuspect(),
				WeaponEnum.REVOLVER.getWeapon());
		ClueSessionService service = new ClueSessionService();
		service.eliminateTriple(triple);
		assertTrue(service.getPossibilities().size() == Integer.valueOf(323));
	}
	
	@Test
	public void testMultipleEliminations() {
		Triple triple = new Triple(RoomEnum.CONSERVATORY.getRoom(), SuspectEnum.MUSTARD.getSuspect(),
				WeaponEnum.REVOLVER.getWeapon());
		ClueSessionService service = new ClueSessionService();
		service.eliminateTriple(triple);
		
		triple = new Triple(RoomEnum.HALL.getRoom(), SuspectEnum.SCARLET.getSuspect(),
				WeaponEnum.CANDLESTICK.getWeapon());
		service.eliminateTriple(triple);
		assertTrue(service.getPossibilities().size() == Integer.valueOf(322));
	}
}
