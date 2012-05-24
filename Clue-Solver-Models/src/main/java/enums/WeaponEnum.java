package enums;

import model.Weapon;

public enum WeaponEnum {
	CANDLESTICK(new Weapon("candlestick")), WRENCH(new Weapon("wrench")), ROPE(new Weapon("rope")), REVOLVER(
			new Weapon("revolver")), KNIFE(new Weapon("knife")), LEADPIPE(new Weapon("lead pipe"));

	private Weapon weapon;

	private WeaponEnum(Weapon weapon) {
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	public static String[] getStringValues() {
		String[] names = new String[values().length];
		int i = 0;
		for (WeaponEnum renum : values()) {
			names[i] = renum.name();
			i++;
		}
		return names;
	}
}
