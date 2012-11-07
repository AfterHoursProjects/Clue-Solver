package model;

import javax.xml.bind.annotation.XmlRootElement;

import enums.CardTypes;

@XmlRootElement(name = "suspect")
public class Suspect extends Card {
	private static final long serialVersionUID = 5295427773711389474L;

	public Suspect() {
		this.setType(CardTypes.SUSPECT.name());
	}

	public Suspect(final String name) {
		super();
		this.setName(name);
	}
}
