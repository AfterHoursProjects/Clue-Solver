package model;

import java.util.ArrayList;
import java.util.List;

public class Triple {
	private Suspect suspect;
	private Weapon weapon;
	private Room room;

	public Triple() {
		this.room = new Room();
		this.suspect = new Suspect();
		this.weapon = new Weapon();
	}

	public Triple(String roomName, String suspectName, String weaponName) {
		this.room = new Room(roomName);
		this.suspect = new Suspect(suspectName);
		this.weapon = new Weapon(weaponName);
	}

	public Triple(Room room, Suspect suspect, Weapon weapon) {
		this.room = room;
		this.suspect = suspect;
		this.weapon = weapon;
	}

	public Room getRoom() {
		return room;
	}

	public Suspect getSuspect() {
		return suspect;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setSuspect(Suspect suspect) {
		this.suspect = suspect;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public List<Card> getAtrributes() {
		List<Card> attributes = new ArrayList<Card>();
		attributes.add(this.room);
		attributes.add(this.suspect);
		attributes.add(this.weapon);
		return attributes;
	}
}
