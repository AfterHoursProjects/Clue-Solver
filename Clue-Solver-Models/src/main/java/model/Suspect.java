package model;

import javax.xml.bind.annotation.XmlRootElement;

import enums.CardTypes;

@XmlRootElement(name="suspect")
public class Suspect extends Card {
	private static final long serialVersionUID = 5295427773711389474L;

	public Suspect() {
		this.type = CardTypes.SUSPECT.name();
	}

	public Suspect(final String name) {
		this.type = CardTypes.SUSPECT.name();
		this.name = name;
	}
}
