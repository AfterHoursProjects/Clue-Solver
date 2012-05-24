package enums;

import model.Suspect;

public enum SuspectEnum {
	MUSTARD(new Suspect("mustard")), SCARLET(new Suspect("scarlet")), PLUM(new Suspect("plum")), GREEN(new Suspect(
			"green")), WHITE(new Suspect("white")), PEACOCK(new Suspect("peacock"));

	private Suspect suspect;

	private SuspectEnum(Suspect suspect) {
		this.suspect = suspect;
	}

	public Suspect getSuspect() {
		return this.suspect;
	}

	public static String[] getStringValues() {
		String[] names = new String[values().length];
		int i = 0;
		for (SuspectEnum renum : values()) {
			names[i] = renum.name();
			i++;
		}
		return names;
	}
}
