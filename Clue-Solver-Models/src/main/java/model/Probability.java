package model;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "probability")
public class Probability<T> implements Comparable<Probability<T>> {
	private final double probability;
	private final T wrappedObject;

	@SuppressWarnings("unused")
	private Probability() {
		probability = 0.0;
		wrappedObject = null;
	}

	public Probability(T object, double probability) {
		this.wrappedObject = object;
		this.probability = probability;
	}

	@Override
	public int compareTo(Probability<T> other) {
		return Double.valueOf(probability).compareTo(Double.valueOf(other.getProbability()));
	}

	@XmlAttribute(name = "value")
	public double getProbability() {
		return probability;
	}

	@XmlAnyElement()
	public T getWrappedObject() {
		return wrappedObject;
	}
}
