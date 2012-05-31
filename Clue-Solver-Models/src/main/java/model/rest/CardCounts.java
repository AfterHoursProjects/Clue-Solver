package model.rest;

import javax.xml.bind.annotation.XmlRootElement;

import model.Card;

@XmlRootElement(name = "cardCount")
public class CardCounts {
	private final Card card;
	private final int count;

	public CardCounts(Card card, int count) {
		super();
		this.card = card;
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CardCounts other = (CardCounts) obj;
		if (card == null) {
			if (other.card != null) {
				return false;
			}
		} else if (!card.equals(other.card)) {
			return false;
		}
		if (count != other.count) {
			return false;
		}
		return true;
	}

	public Card getCard() {
		return card;
	}

	public Integer getCount() {
		return count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((card == null) ? 0 : card.hashCode());
		result = prime * result + count;
		return result;
	}

	@Override
	public String toString() {
		return "CardCounts [card=" + card + ", count=" + count + "]";
	}
}
