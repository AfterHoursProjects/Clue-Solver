package enums;

import model.Suspect;

public enum SuspectEnum {
	MUSTARD(new Suspect("mustard")), SCARLET(new Suspect("scarlet")), PLUM(new Suspect("plum")), GREEN(new Suspect("green")), WHITE(
			new Suspect("white")), PEACOCK(new Suspect("peacock"));
	
	private Suspect suspect;

	private SuspectEnum(Suspect suspect) {
		this.suspect = suspect;
	}

	public Suspect getSuspect() {
		return this.suspect;
	}
}
