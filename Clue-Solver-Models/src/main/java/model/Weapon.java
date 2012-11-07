package model;

import javax.xml.bind.annotation.XmlRootElement;

import enums.CardTypes;

@XmlRootElement(name = "weapon")
public class Weapon extends Card {
	private static final long serialVersionUID = 3384907221326984763L;

	public Weapon() {
		this.setType(CardTypes.WEAPON.name());
	}

	public Weapon(final String name) {
		super();
		this.setName(name);
	}
}
