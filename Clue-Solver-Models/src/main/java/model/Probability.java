package model;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "probability")
public class Probability<T> implements Comparable<Probability<T>> {
	private double probability;
	private T wrappedObject;

	// For jackson json parsing
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

	@XmlAttribute(name = "chance")
	public double getProbability() {
		return probability;
	}

	@XmlAnyElement()
	public T getWrappedObject() {
		return wrappedObject;
	}
	
	// For jackson json parsing
	@SuppressWarnings("unused")
	private void setWrappedObject(T wrappedObject) {
		this.wrappedObject = wrappedObject;
	}

	// For jackson json parsing
	@SuppressWarnings("unused")
	private void setProbability(double probability) {
		this.probability = probability;
	}
}
