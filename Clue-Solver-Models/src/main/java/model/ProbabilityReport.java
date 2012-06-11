package model;

import java.util.Collection;
import java.util.SortedSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Sets;

@XmlRootElement(name = "probabilityReport")
public class ProbabilityReport {
	private final SortedSet<Probability<Room>> rooms;
	private final SortedSet<Probability<Weapon>> weapons;
	private final SortedSet<Probability<Suspect>> suspects;

	public ProbabilityReport(Iterable<Probability<Room>> rooms, Iterable<Probability<Weapon>> weapons,
			Iterable<Probability<Suspect>> suspects) {
		this.rooms = Sets.newTreeSet(rooms);
		this.weapons = Sets.newTreeSet(weapons);
		this.suspects = Sets.newTreeSet(suspects);
	}

	private <T extends Card> Probability<T> getMostLikely(SortedSet<Probability<T>> set) {
		return set.first();
	}

	public Probability<Room> getMostLikelyRoom() {
		return getMostLikely(rooms);
	}

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

	public Probability<Weapon> getMostLikelyWeapon() {
		return getMostLikely(weapons);
	}

	@XmlElementWrapper(name = "rooms")
	public Collection<Probability<Room>> getRoomCounts() {
		return rooms;
	}

	@XmlElementWrapper(name = "suspects")
	public Collection<Probability<Suspect>> getSuspectCounts() {
		return suspects;
	}

	@XmlElementWrapper(name = "weapons")
	public Collection<Probability<Weapon>> getWeaponCounts() {
		return weapons;
	}
}
