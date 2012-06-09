package service.probability;

import java.util.Collection;

import model.CardCount;
import model.ProbabilityReport;
import model.Room;
import model.Suspect;
import model.Triple;
import model.TripleList;
import model.Weapon;

import org.junit.Test;

public class ProbabilityCalculatorTest {
	private TripleList generateTriples() {
		// TODO stubby
		return null;
	}

	@Test
	public void testGetProbabilities() {
		ProbabilityCalculator calc = new ProbabilityCalculatorImpl();
		ProbabilityReport report = calc.generateProbabilityReport(generateTriples());

		// TODO: Test most likely
		Triple mostLikely = report.getMostLikelyTriple();

		// TODO: Test overall report
		Collection<CardCount<Weapon>> weaponReport = report.getWeaponCounts();
		Collection<CardCount<Room>> roomReport = report.getRoomCounts();
		Collection<CardCount<Suspect>> suspectReport = report.getSuspectCounts();
	}

}
