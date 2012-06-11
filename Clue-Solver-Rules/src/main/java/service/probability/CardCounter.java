package service.probability;

import model.Card;
import model.ObjectCounter;
import model.Triple;

/**
 * Used to keep a running total of cards and be able to return them by card type Uses the {@link ObjectCounter} to
 * return its results
 * 
 * @author matt
 * 
 */
public interface CardCounter {
	/**
	 * Count the parameter card
	 * 
	 * @param card
	 *            {@link Card} to be counted, should not be null or an {@link IllegalArgumentException} will be thrown
	 */
	public void countCard(Card card);

	/**
	 * Count the cards in a triple
	 * 
	 * @param triple
	 *            {@link Triple} to count, should not be null and should not contain null cards
	 */
	public void countCards(Triple triple);

	/**
	 * Returns an iterable over all cards of certain type, IE all weapons.
	 * 
	 * @param cardClass
	 *            The class of card being looked for
	 * @return an {@link Iterable} over all counters with that card class
	 */
	public <T extends Card> Iterable<ObjectCounter<T>> getCountForCardType(Class<T> cardClass);
}
