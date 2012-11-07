package model.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import model.Probability;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;

@XmlRootElement(name = "probabilityReport")
@XmlSeeAlso({ Room.class, Suspect.class, Triple.class, Weapon.class })
public class ProbabilityReport {
	private List<Probability<Room>> rooms;
	private List<Probability<Weapon>> weapons;
	private List<Probability<Suspect>> suspects;
	private Probability<Room> mostLikelyRoom;
	private Probability<Suspect> mostLikelySuspect;
	private Probability<Weapon> mostLikelyWeapon;
	private Probability<Triple> mostLikelyTriple;

	public ProbabilityReport() {
	}

	@XmlElement(name = "mostLikelyRoom")
	public Probability<Room> getMostLikelyRoom() {
		return mostLikelyRoom;
	}

	@XmlElement(name = "mostLikelySuspect")
	public Probability<Suspect> getMostLikelySuspect() {
		return mostLikelySuspect;
	}

	@XmlElement(name = "mostLikelyTriple")
	public Probability<Triple> getMostLikelyTriple() {
		return mostLikelyTriple;
	}

	@XmlElement(name = "mostLikelyWeapon")
	public Probability<Weapon> getMostLikelyWeapon() {
		return mostLikelyWeapon;
	}

	@XmlElementWrapper
	@XmlElement(name = "roomProbability")
	public List<Probability<Room>> getRooms() {
		return rooms;
	}

	@XmlElementWrapper
	@XmlElement(name = "suspectProbability")
	public List<Probability<Suspect>> getSuspects() {
		return suspects;
	}

	@XmlElementWrapper
	@XmlElement(name = "weaponProbability")
	public List<Probability<Weapon>> getWeapons() {
		return weapons;
	}

	public void setMostLikelyRoom(Probability<Room> mostLikelyRoom) {
		this.mostLikelyRoom = mostLikelyRoom;
	}

	public void setMostLikelySuspect(Probability<Suspect> mostLikelySuspect) {
		this.mostLikelySuspect = mostLikelySuspect;
	}

	public void setMostLikelyTriple(Probability<Triple> mostLikelyTriple) {
		this.mostLikelyTriple = mostLikelyTriple;
	}

	public void setMostLikelyWeapon(Probability<Weapon> mostLikelyWeapon) {
		this.mostLikelyWeapon = mostLikelyWeapon;
	}

	public void setRooms(List<Probability<Room>> rooms) {
		this.rooms = rooms;
	}

	public void setSuspects(List<Probability<Suspect>> suspects) {
		this.suspects = suspects;
	}

	public void setWeapons(List<Probability<Weapon>> weapons) {
		this.weapons = weapons;
	}
}
