package service.probability;

import model.ProbabilityReport;
import model.Room;
import model.Suspect;
import model.Weapon;

public class CardCounters {
	public static ProbabilityReport toProbabilityReport(CardCounter counter) {
		ProbabilityReport report = new ProbabilityReport(counter.getCountForCardType(Room.class),
				counter.getCountForCardType(Weapon.class), counter.getCountForCardType(Suspect.class));

		return report;
	}

	private CardCounters() {

	}
}
