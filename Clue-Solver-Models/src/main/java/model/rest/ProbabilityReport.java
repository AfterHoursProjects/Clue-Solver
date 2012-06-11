package model.rest;

import java.util.List;
import java.util.SortedSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import model.Card;
import model.Probability;
import model.Room;
import model.Suspect;
import model.Triple;
import model.Weapon;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

@XmlRootElement(name = "probabilityReport")
@XmlSeeAlso({ Room.class, Suspect.class, Triple.class, Weapon.class })
public class ProbabilityReport {
	private final SortedSet<Probability<Room>> rooms;
	private final SortedSet<Probability<Weapon>> weapons;
	private final SortedSet<Probability<Suspect>> suspects;

	public ProbabilityReport() {
		rooms = Sets.newTreeSet();
		weapons = Sets.newTreeSet();
		suspects = Sets.newTreeSet();
	}

	public ProbabilityReport(Iterable<Probability<Room>> rooms, Iterable<Probability<Weapon>> weapons,
			Iterable<Probability<Suspect>> suspects) {
		this.rooms = Sets.newTreeSet(rooms);
		this.weapons = Sets.newTreeSet(weapons);
		this.suspects = Sets.newTreeSet(suspects);
	}

	private <T extends Card> Probability<T> getMostLikely(SortedSet<Probability<T>> set) {
		return set.first();
	}

	@XmlElement(name = "mostLikelyRoom")
	public Probability<Room> getMostLikelyRoom() {
		return getMostLikely(rooms);
	}

	@XmlElement(name = "mostLikelySuspect")
	public Probability<Suspect> getMostLikelySuspect() {
		return getMostLikely(suspects);
	}

	@XmlElement(name = "mostLikelyTriple")
	public Probability<Triple> getMostLikelyTriple() {
		Probability<Room> roomProbability = getMostLikelyRoom();
		Probability<Suspect> suspectProbability = getMostLikelySuspect();
		Probability<Weapon> weaponProbability = getMostLikelyWeapon();
		double total = roomProbability.getProbability() * suspectProbability.getProbability()
				* weaponProbability.getProbability();

		return new Probability<Triple>(new Triple(roomProbability.getWrappedObject(),
				suspectProbability.getWrappedObject(), weaponProbability.getWrappedObject()), total);
	}

	@XmlElement(name = "mostLikelyWeapon")
	public Probability<Weapon> getMostLikelyWeapon() {
		return getMostLikely(weapons);
	}

	@XmlElementWrapper(name = "rooms")
	public List<Probability<Room>> getRoomCounts() {
		return Lists.newArrayList(rooms);
	}

	@XmlElementWrapper(name = "suspects")
	public List<Probability<Suspect>> getSuspectCounts() {
		return Lists.newArrayList(suspects);
	}

	@XmlElementWrapper(name = "weapons")
	public List<Probability<Weapon>> getWeaponCounts() {
		return Lists.newArrayList(weapons);
	}
}
