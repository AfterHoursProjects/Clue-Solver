package model;

import enums.CardTypes;

public class Room extends Card {
	private static final long serialVersionUID = 5721757302997839258L;

	public Room() {
		this.type = CardTypes.ROOM.name();
	}

	public Room(final String name) {
		this.type = CardTypes.ROOM.name();
		this.name = name;
	}
}
