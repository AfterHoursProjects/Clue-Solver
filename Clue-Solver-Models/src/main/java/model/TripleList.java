package model;

import java.util.ArrayList;

/**
 * Extension of a {@link ArrayListList} that only allows triples to be added to it 
 *
 */
public class TripleList extends ArrayList<Triple>{

	private static final long serialVersionUID = -2954697845590260784L;

	public void addTriple(Room room, Suspect suspect, Weapon weapon){
		this.add(new Triple(room,suspect,weapon));
	}
}
