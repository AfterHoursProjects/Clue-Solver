package service.probability;

import model.ProbabilityReport;
import model.Triple;
import model.TripleList;

public class ProbabilityCalculatorImpl implements ProbabilityCalculator {
	private CardCounter counter;

	@Override
	public ProbabilityReport generateProbabilityReport(TripleList triples) {
		for (Triple triple : triples) {
			counter.countCards(triple);
		}

		return CardCounters.toProbabilityReport(counter);
	}

}
