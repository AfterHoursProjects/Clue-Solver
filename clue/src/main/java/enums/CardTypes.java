package enums;

public enum CardTypes {
	WEAPON("Weapon"), SUSPECT("Suspect"), ROOM("Room");

	String name;

	private CardTypes(String name) {
		this.name = name;
	}
}
