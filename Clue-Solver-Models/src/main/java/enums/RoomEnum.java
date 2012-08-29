package enums;

import java.util.HashSet;

import model.Room;

public enum RoomEnum {
	KITCHEN(new Room("kitchen")), 
        
        Study(new Room("study")), 
        
        CONSERVATORY(new Room("conservatory")), 
        
        HALL(new Room("hall")), 
        
        DININGROOM(new Room("dining room")), 
        
        BILLIARDROOM(new Room("billiard room")), 
        
        LOUNGE(new Room("lounge")), 
        
        LIBRARY(new Room("library")), 
        
        BALLROOM(new Room("ballroom"));

	public static Iterable<String> getStringValues() {
		HashSet<String> rooms = new HashSet<String>();
		for (RoomEnum renum : values()) {
			rooms.add(renum.name());
		}

		return rooms;
	}

	Room room;

	RoomEnum(Room room) {
		this.room = room;
	}

	public Room getRoom() {
		return this.room;
	}
}
