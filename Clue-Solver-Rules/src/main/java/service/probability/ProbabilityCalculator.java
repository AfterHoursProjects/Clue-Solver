package service.probability;

import model.ProbabilityReport;
import model.TripleList;

/**
 * Calculation services for probability
 * 
 * @author matt
 * 
 */
public interface ProbabilityCalculator {
	/**
	 * Generates a report of that can be used to find probabilities
	 * 
	 * @param triples
	 *            List of triples to calculate
	 * @return a report that can be used to display and review the results of the calculation
	 */
	public ProbabilityReport generateProbabilityReport(TripleList triples);
}
