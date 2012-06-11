package service.probability;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import model.Probability;
import model.Triple;
import model.TripleList;
import model.rest.ProbabilityReport;

import org.junit.Test;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class ProbabilityCalculatorTest {
	@Test
	public void testGetProbabilities() {
		ProbabilityCalculator calc = new ProbabilityCalculatorImpl();
		TripleList triples = new TripleList();
		triples.add(new Triple(RoomEnum.BALLROOM.getRoom(), SuspectEnum.GREEN.getSuspect(), WeaponEnum.CANDLESTICK.getWeapon()));
		triples.add(new Triple(RoomEnum.BILLIARDROOM.getRoom(), SuspectEnum.GREEN.getSuspect(), WeaponEnum.CANDLESTICK.getWeapon()));

		ProbabilityReport report = calc.generateProbabilityReport(triples);
		Probability<Triple> mostLikely = report.getMostLikelyTriple();
		assertEquals(.5d, mostLikely.getProbability(), 0.0);
		assertTrue(report.getRooms().size() == 2);
		assertEquals(.5d, report.getMostLikelyRoom().getProbability(), 0.0);
		assertEquals(1.0d, report.getMostLikelySuspect().getProbability(), 0.0);
		assertEquals(1.0d, report.getMostLikelyWeapon().getProbability(), 0.0);
	}

}
