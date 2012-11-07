package enums;

public enum CardTypes {
	WEAPON("Weapon"),
	SUSPECT("Suspect"),
	ROOM("Room");
	private String label;

	private CardTypes(String name) {
		this.label = name;
	}

	public String label() {
		return label;
	}
}
