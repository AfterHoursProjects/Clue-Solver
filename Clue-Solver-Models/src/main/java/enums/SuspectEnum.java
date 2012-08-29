package enums;

import java.util.HashSet;

import model.Suspect;

public enum SuspectEnum {
	MUSTARD(new Suspect("mustard")), 
        
        SCARLET(new Suspect("scarlet")), 
        
        PLUM(new Suspect("plum")), 
        
        GREEN(new Suspect("green")), 
        
        WHITE(new Suspect("white")), 
        
        PEACOCK(new Suspect("peacock"));

	public static Iterable<String> getStringValues() {
		HashSet<String> suspects = new HashSet<String>();
		for (SuspectEnum renum : values()) {
			suspects.add(renum.name());
		}

		return suspects;
	}

	private Suspect suspect;

	private SuspectEnum(Suspect suspect) {
		this.suspect = suspect;
	}

	public Suspect getSuspect() {
		return this.suspect;
	}
}
