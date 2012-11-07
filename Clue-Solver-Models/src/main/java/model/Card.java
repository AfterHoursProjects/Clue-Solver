package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.base.Objects;

import enums.CardTypes;

@XmlRootElement(name = "card")
public class Card implements Serializable {
	private static final long serialVersionUID = 2331477538254078635L;

	private String type;
	private String name;

	public Card() {

	}

	public Card(String type, String name) {
		this.type = type;
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof Card) {
			final Card other = (Card) obj;
			return Objects.equal(name, other.name) && Objects.equal(type, other.type);
		}
		return false;
	}

	/**
	 * Gets the name of the cards, IE peacock..
	 * 
	 * @return the name of the card
	 */
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	/**
	 * Gets the type of the cards see {@link CardTypes} for valid types
	 * 
	 * @return the type of the card
	 */
	@XmlAttribute(name = "type")
	public String getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return Objects.hashCode(name, type);
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setType(final String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
