package service;

import java.util.ArrayList;
import java.util.List;

import listeners.AfterActivationFiredEventListener;
import model.Card;
import model.Triple;
import model.TripleList;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class ClueSessionService {
	private final TripleList possibilities;

	private final StatefulKnowledgeSession clueSession;

	private final KnowledgeBase clueRuleBase;

	public ClueSessionService() {
		final KnowledgeBuilderConfiguration config = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		config.setProperty("drools.dialect.mvel.strict", Boolean.FALSE.toString());
		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(config);

		kbuilder.add(ResourceFactory.newClassPathResource("rules/EliminationRules.drl"), ResourceType.DRL);

		if (kbuilder.hasErrors()) {
			throw new RuntimeException(kbuilder.getErrors().toString());
		}
		clueRuleBase = kbuilder.newKnowledgeBase();
		clueSession = clueRuleBase.newStatefulKnowledgeSession();
		clueSession.addEventListener(new AfterActivationFiredEventListener());

		final TripleCreator creator = new TripleCreator();

		possibilities = creator.createAllTriples();

		clueSession.insert(possibilities);
	}

	public void eliminateCard(final Card card) {
		clueSession.insert(card);
		clueSession.fireAllRules();
	}

	public void eliminateTriple(final Triple triple) {
		clueSession.insert(triple);
		clueSession.fireAllRules();

	}

	public StatefulKnowledgeSession getClueSession() {
		return clueSession;
	}

	public TripleList getPossibilities() {
		return possibilities;
	}

	public List<Card> getRemainingCards() {
		final ArrayList<Card> cards = new ArrayList<Card>();

		return cards;
	}
}
