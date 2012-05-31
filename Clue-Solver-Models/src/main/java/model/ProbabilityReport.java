package model;

import java.util.List;

public class ProbabilityReport {
	private Triple mostLikely;
	private List<ProbabilityCardReport> cards;

	public List<ProbabilityCardReport> getCardsWithProbability() {
		return cards;
	}

	public Triple getMostLikelyTriple() {
		return mostLikely;
	}

}
