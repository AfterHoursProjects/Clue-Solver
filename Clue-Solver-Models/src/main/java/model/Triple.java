package model;

import javax.xml.bind.annotation.XmlRootElement;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

/**
 * This model represents a full triple in clue, this will include the {@link Suspect}, {@link Weapon}, and the
 * {@link Room}. In the end it will be set of three {@link Card}s
 */
@XmlRootElement(name = "triple")
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

	/**
	 * @return The {@link Room}
	 * @see RoomEnum
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * @return the {@link Suspect}
	 * @see SuspectEnum
	 */
	public Suspect getSuspect() {
		return suspect;
	}

	/**
	 * @return the {@link Weapon}
	 * @see WeaponEnum
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * @param room
	 *            the {@link Room} this triple is representing
	 * @see RoomEnum
	 */
	public void setRoom(final Room room) {
		this.room = room;
	}

	/**
	 * @param room
	 *            the {@link Suspect} this triple is representing
	 * @see SuspectEnum
	 */
	public void setSuspect(final Suspect suspect) {
		this.suspect = suspect;
	}

	/**
	 * @param room
	 *            the {@link Weapon} this triple is representing
	 * @see WeaponEnum
	 */
	public void setWeapon(final Weapon weapon) {
		this.weapon = weapon;
	}

	public String toString() {
		return new StringBuilder().append(weapon.toString()).append(" - ").append(room.toString()).append(" - ")
				.append(suspect.toString()).toString();
	}

}
