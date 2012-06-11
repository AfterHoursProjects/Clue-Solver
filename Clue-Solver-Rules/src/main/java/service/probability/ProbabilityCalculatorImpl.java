package service.probability;

import java.util.List;

import model.Card;
import model.ObjectCounter;
import model.Probability;
import model.ProbabilityReport;
import model.Room;
import model.Suspect;
import model.Triple;
import model.TripleList;
import model.Weapon;

import com.google.common.collect.Lists;

public class ProbabilityCalculatorImpl implements ProbabilityCalculator {
	private final CardCounter counter = new CardCounterImpl();

	private ProbabilityReport createReportFromCounter(CardCounter counter) {
		Iterable<ObjectCounter<Weapon>> weapons = counter.getCountForCardType(Weapon.class);
		Iterable<ObjectCounter<Suspect>> suspects = counter.getCountForCardType(Suspect.class);
		Iterable<ObjectCounter<Room>> rooms = counter.getCountForCardType(Room.class);

		return new ProbabilityReport(toProbabilities(rooms), toProbabilities(weapons), toProbabilities(suspects));
	}

	@Override
	public ProbabilityReport generateProbabilityReport(TripleList triples) {
		for (Triple triple : triples) {
			counter.countCards(triple);
		}

		return createReportFromCounter(counter);
	}

	private <F extends Card> List<Probability<F>> toProbabilities(Iterable<ObjectCounter<F>> toConvert) {
		List<Probability<F>> converted = Lists.newArrayList();
		double size = 0;

		// Has to loop twice first to get total instances in that list, second to set the proabilities
		for (ObjectCounter<F> counter : toConvert) {
			size += counter.getCount();
		}

		for (ObjectCounter<F> counter : toConvert) {
			converted.add(new Probability<F>(counter.getCard(), counter.getCount() / size));
		}

		return converted;
	}
}
