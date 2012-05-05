package service;

import listeners.AfterActivationFiredEventListener;
import model.Card;
import model.Triple;
import model.TripleList;

import org.drools.runtime.StatefulKnowledgeSession;

public class ClueSessionService {
	private final TripleList possibilities;
	private final StatefulKnowledgeSession clueSession;
	private static final ClueSessionFactory factory = new ClueSessionFactory();
	

	public ClueSessionService() {
		clueSession = factory.getNewSession();
		
		clueSession.addEventListener(new AfterActivationFiredEventListener());
		final TripleCreator creator = new TripleCreator();
		possibilities = creator.createAllTriples();
		clueSession.insert(possibilities);
	}

	/**
	 * Inserts a new card into the drools facts
	 * @param card {@link Card} to insert
	 */
	public void eliminateCard(final Card card) {
		clueSession.insert(card);
		clueSession.fireAllRules();
	}

	/**
	 * Inserts a new triple into our facts
	 * @param triple {@link Triple} to insert
	 */
	public void eliminateTriple(final Triple triple) {
		clueSession.insert(triple);
		clueSession.fireAllRules();

	}

	public TripleList getPossibilities() {
		return possibilities;
	}
}
