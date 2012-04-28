package model;

import enums.CardTypes;

public class Room extends Card {

	public Room() {
		this.type = CardTypes.ROOM.name();
	}

	public Room(final String name) {
		this.type = CardTypes.ROOM.name();
		this.name = name;
	}
}
