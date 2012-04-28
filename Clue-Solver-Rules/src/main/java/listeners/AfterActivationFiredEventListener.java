package listeners;

import org.drools.event.rule.ActivationCancelledEvent;
import org.drools.event.rule.ActivationCreatedEvent;
import org.drools.event.rule.AfterActivationFiredEvent;
import org.drools.event.rule.AgendaEventListener;
import org.drools.event.rule.AgendaGroupPoppedEvent;
import org.drools.event.rule.AgendaGroupPushedEvent;
import org.drools.event.rule.BeforeActivationFiredEvent;
import org.drools.event.rule.RuleFlowGroupActivatedEvent;
import org.drools.event.rule.RuleFlowGroupDeactivatedEvent;

/**
 * Runtime Agenda Listener so we can provide feedback on what rules fired during a given iteration.
 * 
 * @author Dean Turner
 * 
 */
public class AfterActivationFiredEventListener implements AgendaEventListener {

	@Override
	public void activationCancelled(final ActivationCancelledEvent event) {
	}

	@Override
	public void activationCreated(final ActivationCreatedEvent event) {
	}

	@Override
	public void afterActivationFired(final AfterActivationFiredEvent event) {
		System.out.println("Fired Rule: " + event.getActivation().getRule().getName());
	}

	@Override
	public void afterRuleFlowGroupActivated(final RuleFlowGroupActivatedEvent event) {
	}

	@Override
	public void afterRuleFlowGroupDeactivated(final RuleFlowGroupDeactivatedEvent event) {
	}

	@Override
	public void agendaGroupPopped(final AgendaGroupPoppedEvent event) {
	}

	@Override
	public void agendaGroupPushed(final AgendaGroupPushedEvent event) {
	}

	@Override
	public void beforeActivationFired(final BeforeActivationFiredEvent event) {
	}

	@Override
	public void beforeRuleFlowGroupActivated(final RuleFlowGroupActivatedEvent event) {
	}

	@Override
	public void beforeRuleFlowGroupDeactivated(final RuleFlowGroupDeactivatedEvent event) {
	}

}
