package model;

import enums.CardTypes;

public class Weapon extends Card {

	public Weapon() {
		this.type = CardTypes.WEAPON.name();
	}

	public Weapon(final String name) {
		this.type = CardTypes.WEAPON.name();
		this.name = name;
	}
}
