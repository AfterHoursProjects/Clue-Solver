package model;

import enums.CardTypes;

public class Weapon extends Card {
	private static final long serialVersionUID = 3384907221326984763L;

	public Weapon() {
		this.type = CardTypes.WEAPON.name();
	}

	public Weapon(final String name) {
		this.type = CardTypes.WEAPON.name();
		this.name = name;
	}
}
