package service;

import model.TripleList;

import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

import enums.RoomEnum;
import enums.SuspectEnum;
import enums.WeaponEnum;

public class TripleCreator {
	
	public TripleList createAllTriples() {
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

		kbuilder.add(ResourceFactory.newClassPathResource("rules/CreationRules.drl"), ResourceType.DRL);

		if (kbuilder.hasErrors()) {
			throw new RuntimeException(kbuilder.getErrors().toString());
		}
		
		StatefulKnowledgeSession session = kbuilder.newKnowledgeBase().newStatefulKnowledgeSession();
		for(SuspectEnum suspect:SuspectEnum.values()){
			session.insert(suspect.getSuspect());
		}
		for(WeaponEnum weapon:WeaponEnum.values()){
			session.insert(weapon.getWeapon());
		}
		for(RoomEnum room:RoomEnum.values()){
			session.insert(room.getRoom());
		}
		TripleList tripleList = new TripleList();
		session.insert(tripleList);
		
		session.fireAllRules();
		
		return tripleList;
	}

}
