package model.rest;

import java.util.List;

import model.Card;

/**
 * @author matt
 * 
 */
public class ClueServerStatus {
	private int remainingTriples;
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
	public int getRemainingTriples() {
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
	public void setRemainingTriples(final int remainingTriples) {
		this.remainingTriples = remainingTriples;
	}
}
