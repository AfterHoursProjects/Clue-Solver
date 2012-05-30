package model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import enums.CardTypes;

@XmlRootElement(name = "card")
public class Card implements Serializable {
	private static final long serialVersionUID = 2331477538254078635L;

	protected String type;
	protected String name;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		final Card other = (Card) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
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
		final int prime = 31;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (type == null ? 0 : type.hashCode());
		return result;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String toString() {
		return this.name;
	}

}
