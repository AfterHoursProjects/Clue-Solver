package model;

public class Triple {
	private Suspect suspect;
	private Weapon weapon;
	private Room room;

	public Triple() {
		room = new Room();
		suspect = new Suspect();
		weapon = new Weapon();
	}

	public Triple(final Room room, final Suspect suspect, final Weapon weapon) {
		this.room = room;
		this.suspect = suspect;
		this.weapon = weapon;
	}

	public Triple(final String roomName, final String suspectName, final String weaponName) {
		room = new Room(roomName);
		suspect = new Suspect(suspectName);
		weapon = new Weapon(weaponName);
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

	public void setRoom(final Room room) {
		this.room = room;
	}

	public void setSuspect(final Suspect suspect) {
		this.suspect = suspect;
	}

	public void setWeapon(final Weapon weapon) {
		this.weapon = weapon;
	}

}
