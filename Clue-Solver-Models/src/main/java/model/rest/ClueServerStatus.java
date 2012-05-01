package model.rest;

import java.util.List;

import model.Card;
import model.Triple;

/**
 * @author matt
 * 
 */
public class ClueServerStatus {
	private List<Triple> remainingTriples;
	private List<Card> remainingCards;

	/**
	 * @return the remainingCards
	 */
	public List<Card> getRemainingCards() {
		return remainingCards;
	}

	/**
	 * @return the remainingTriples
	 */
	public List<Triple> getRemainingTriples() {
		return remainingTriples;
	}

	/**
	 * @param remainingCards
	 *            the remainingCards to set
	 */
	public void setRemainingCards(final List<Card> remainingCards) {
		this.remainingCards = remainingCards;
	}

	/**
	 * @param remainingTriples
	 *            the remainingTriples to set
	 */
	public void setRemainingTriples(final List<Triple> remainingTriples) {
		this.remainingTriples = remainingTriples;
	}
}
