package model;

import enums.CardTypes;

public class Suspect extends Card {
	public Suspect() {
		this.type = CardTypes.SUSPECT.name();
	}

	public Suspect(final String name) {
		this.type = CardTypes.SUSPECT.name();
		this.name = name;
	}
}
