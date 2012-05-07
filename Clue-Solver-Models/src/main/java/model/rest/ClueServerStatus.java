package model.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import model.Card;
import model.Triple;

/**
 * Container for the current status of the servers game
 * @author matt
 */
@XmlRootElement(name="status")
public class ClueServerStatus {
	private List<Triple> remainingTriples;
	private List<Card> remainingCards;

	/**
	 * @return the remainingCards
	 * @see Card
	 */
	@XmlElementWrapper
	@XmlElement(name="card")
	public List<Card> getRemainingCards() {
		return remainingCards;
	}

	/**
	 * @return the remainingTriples
	 * @see Triple
	 */
	@XmlElementWrapper
	@XmlElement(name="triple")
	public List<Triple> getRemainingTriples() {
		return remainingTriples;
	}

	/**
	 * @param remainingCards
	 *            the remainingCards to set
	 * @see Card
	 */
	public void setRemainingCards(final List<Card> remainingCards) {
		this.remainingCards = remainingCards;
	}

	/**
	 * @param remainingTriples
	 *            the remainingTriples to set
	 * @see Triple
	 */
	public void setRemainingTriples(final List<Triple> remainingTriples) {
		this.remainingTriples = remainingTriples;
	}
}
