package service.probability;

import model.Card;
import model.CardCount;
import model.Triple;

public interface CardCounter {
	public void countCard(Card card);

	public void countCards(Triple triples);

	public <T extends Card> Iterable<CardCount<T>> getCountForCardType(Class<T> cardClass);
}
