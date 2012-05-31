package service.probability;

import java.util.List;

import model.ProbabilityCardReport;
import model.ProbabilityReport;
import model.Triple;
import model.TripleList;

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
		List<ProbabilityCardReport> cardReport = report.getCardsWithProbability();
	}

}
