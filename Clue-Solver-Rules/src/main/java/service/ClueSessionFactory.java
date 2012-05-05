package service;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderConfiguration;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * Creates new knowledge sessions from a the clue rule base
 * @author matt
 *
 */
public class ClueSessionFactory {
	private KnowledgeBase clueRuleBase;

	public ClueSessionFactory() {
		final KnowledgeBuilderConfiguration config = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration();
		config.setProperty("drools.dialect.mvel.strict", Boolean.FALSE.toString());
		final KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(config);

		kbuilder.add(ResourceFactory.newClassPathResource("rules/EliminationRules.drl"), ResourceType.DRL);

		if (kbuilder.hasErrors()) {
			throw new RuntimeException(kbuilder.getErrors().toString());
		}
		clueRuleBase = kbuilder.newKnowledgeBase();
	}
	
	public StatefulKnowledgeSession getNewSession() {
		StatefulKnowledgeSession session = clueRuleBase.newStatefulKnowledgeSession();
		return session;
	}
}
