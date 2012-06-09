package model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cardCount")
public class CardCount<T extends Card> implements Comparable<CardCount<T>> {
	private final T card;
	private Integer count = 0;

	public CardCount(T card) {
		this.card = card;
	}

	@Override
	public int compareTo(CardCount<T> other) {
		return this.count.compareTo(other.getCount());
	}

	@XmlElement(name = "card")
	public T getCard() {
		return card;
	}

	@XmlAttribute(name = "count")
	public Integer getCount() {
		return count;
	}

	public void increment() {
		count++;
	}
}
