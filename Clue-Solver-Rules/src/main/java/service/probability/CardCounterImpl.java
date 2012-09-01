package service.probability;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import model.Card;
import model.ObjectCounter;
import model.Triple;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class CardCounterImpl implements CardCounter {
	Map<Card, ObjectCounter<Card>> cardCountMap = Maps.newHashMap();

	@Override
	public void countCard(Card card) {
		ObjectCounter<Card> cardCount = cardCountMap.get(card);
		if (cardCount == null) {
			cardCountMap.put(card, new ObjectCounter<Card>(card));
		} else {
			cardCount.increment();
		}
	}

	@Override
	public void countCards(Triple triples) {
		countCard(triples.getRoom());
		countCard(triples.getSuspect());
		countCard(triples.getWeapon());
	}

	@Override
	public <T extends Card> Iterable<ObjectCounter<T>> getCountForCardType(Class<T> cardClass) {
		Set<ObjectCounter<T>> found = Sets.newHashSet();

		for (Entry<Card, ObjectCounter<Card>> entry : cardCountMap.entrySet()) {
			if (entry.getKey().getClass().equals(cardClass)) {
				// FIXME: Not sure how/if this is possible without the cast
				found.add((ObjectCounter<T>) entry.getValue());
			}
		}
		return found;
	}
}
