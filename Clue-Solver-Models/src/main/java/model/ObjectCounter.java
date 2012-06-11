package model;


public class ObjectCounter<T> implements Comparable<ObjectCounter<T>> {
	private final T card;
	private Integer count = 1;

	public ObjectCounter(T card) {
		this.card = card;
	}

	@Override
	public int compareTo(ObjectCounter<T> other) {
		return this.count.compareTo(other.getCount());
	}

	public T getCard() {
		return card;
	}

	public Integer getCount() {
		return count;
	}

	public void increment() {
		count++;
	}
}
