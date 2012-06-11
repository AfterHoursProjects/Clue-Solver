package service.probability;

import java.util.Collections;
import java.util.List;

import model.Card;
import model.ObjectCounter;
import model.Probability;
import model.Room;
import model.Suspect;
import model.Triple;
import model.TripleList;
import model.Weapon;
import model.rest.ProbabilityReport;

import com.google.common.collect.Lists;

public class ProbabilityCalculatorImpl implements ProbabilityCalculator {
	private final CardCounter counter = new CardCounterImpl();

	private ProbabilityReport createReportFromCounter(CardCounter counter) {
		List<Probability<Weapon>> weapons = toSortedProbabilities(counter.getCountForCardType(Weapon.class));
		List<Probability<Suspect>> suspects = toSortedProbabilities(counter.getCountForCardType(Suspect.class));
		List<Probability<Room>> rooms = toSortedProbabilities(counter.getCountForCardType(Room.class));

		ProbabilityReport report = new ProbabilityReport();
		report.setRooms(rooms);
		report.setWeapons(weapons);
		report.setSuspects(suspects);

		Probability<Room> mostLikelyRoom = rooms.get(0);
		Probability<Suspect> mostLikelySuspect = suspects.get(0);
		Probability<Weapon> mostLikelyWeapon = weapons.get(0);

		report.setMostLikelyRoom(mostLikelyRoom);
		report.setMostLikelySuspect(mostLikelySuspect);
		report.setMostLikelyWeapon(mostLikelyWeapon);

		double tripleProbability = mostLikelyRoom.getProbability() * mostLikelySuspect.getProbability()
				* mostLikelyWeapon.getProbability();
		report.setMostLikelyTriple(new Probability<Triple>(new Triple(mostLikelyRoom.getWrappedObject(), mostLikelySuspect
				.getWrappedObject(), mostLikelyWeapon.getWrappedObject()), tripleProbability));

		return report;
	}

	@Override
	public ProbabilityReport generateProbabilityReport(TripleList triples) {
		for (Triple triple : triples) {
			counter.countCards(triple);
		}

		return createReportFromCounter(counter);
	}

	private <F extends Card> List<Probability<F>> toSortedProbabilities(Iterable<ObjectCounter<F>> toConvert) {
		List<Probability<F>> converted = Lists.newArrayList();
		double size = 0;

		// Has to loop twice first to get total instances in that list, second to set the proabilities
		for (ObjectCounter<F> counter : toConvert) {
			size += counter.getCount();
		}

		for (ObjectCounter<F> counter : toConvert) {
			converted.add(new Probability<F>(counter.getCard(), counter.getCount() / size));
		}

		Collections.sort(converted);
		return converted;
	}
}
