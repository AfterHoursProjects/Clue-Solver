package service;

import static org.junit.Assert.assertTrue;
import model.TripleList;

import org.junit.Test;

public class TripleCreatorTest {
	
	@Test
	public void testCreateAllTriples() {
		TripleCreator creator = new TripleCreator();
		TripleList triples = creator.createAllTriples();
		assertTrue(triples.size() == Integer.valueOf(324));
	}
}
