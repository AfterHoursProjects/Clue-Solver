package enums;

import java.util.HashSet;

import model.Weapon;

public enum WeaponEnum {

	CANDLESTICK(new Weapon("candlestick")),

	WRENCH(new Weapon("wrench")),

	ROPE(new Weapon("rope")),

	REVOLVER(new Weapon("revolver")),

	KNIFE(new Weapon("knife")),

	LEADPIPE(new Weapon("lead pipe"));

	public static Iterable<String> getStringValues() {
		final HashSet<String> weapons = new HashSet<String>();
		for (final WeaponEnum renum : values()) {
			weapons.add(renum.name());
		}

		return weapons;
	}

	private Weapon weapon;

	private WeaponEnum(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}
}
