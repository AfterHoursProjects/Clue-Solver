package model;

import java.util.Collection;
import java.util.SortedSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Sets;

@XmlRootElement(name = "probabilityReport")
public class ProbabilityReport {
	private final SortedSet<CardCount<Room>> rooms;
	private final SortedSet<CardCount<Weapon>> weapons;
	private final SortedSet<CardCount<Suspect>> suspects;

	public ProbabilityReport(Iterable<CardCount<Room>> rooms, Iterable<CardCount<Weapon>> weapons,
			Iterable<CardCount<Suspect>> suspects) {
		this.rooms = Sets.newTreeSet(rooms);
		this.weapons = Sets.newTreeSet(weapons);
		this.suspects = Sets.newTreeSet(suspects);
	}

	private <T extends Card> CardCount<T> getMostLikely(SortedSet<CardCount<T>> set) {
		return set.first();
	}

	public CardCount<Room> getMostLikelyRoom() {
		return getMostLikely(rooms);
	}

	public CardCount<Suspect> getMostLikelySuspect() {
		return getMostLikely(suspects);
	}

	@XmlElement(name = "mostLikelyTriple")
	public Triple getMostLikelyTriple() {
		return new Triple(getMostLikelyRoom().getCard(), getMostLikelySuspect().getCard(), getMostLikelyWeapon()
				.getCard());
	}

	public CardCount<Weapon> getMostLikelyWeapon() {
		return getMostLikely(weapons);
	}

	@XmlElementWrapper(name = "rooms")
	public Collection<CardCount<Room>> getRoomCounts() {
		return rooms;
	}

	@XmlElementWrapper(name = "suspects")
	public Collection<CardCount<Suspect>> getSuspectCounts() {
		return suspects;
	}

	@XmlElementWrapper(name = "weapons")
	public Collection<CardCount<Weapon>> getWeaponCounts() {
		return weapons;
	}
}
