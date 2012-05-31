package service.probability;

import java.util.List;

import model.TripleList;
import model.rest.CardCounts;

/**
 * Calculation services for probability
 * 
 * @author matt
 * 
 */
public interface ProbabilityCalculator {
	/**
	 * Calculates the probabilities using the list of triples. Will go through and count each of them to find the totals
	 * 
	 * @param triples
	 *            List of triples to calculate
	 * @return an {@link Iterable} of all cards found and their counts
	 */
	public List<CardCounts> getProbabilities(final TripleList triples);
}
