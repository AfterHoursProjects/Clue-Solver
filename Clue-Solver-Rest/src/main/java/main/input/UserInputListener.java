package main.input;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;

import events.ServerSignals;

public class UserInputListener implements InputListener {
	private final EventBus eventBus;

	@Inject
	public UserInputListener(EventBus eventBus) {
		this.eventBus = eventBus;
	}

	public boolean lineRead(String input) {
		// Check for user input of quit
		if ("quit".equals(input)) {
			try {
				// Post an event to the event bus
				eventBus.post(ServerSignals.getStopSignal());
				return true;
			} catch (final Exception e) {
				// TODO: Better exception handling
				e.printStackTrace();
			}
		}

		return false;
	}
}
