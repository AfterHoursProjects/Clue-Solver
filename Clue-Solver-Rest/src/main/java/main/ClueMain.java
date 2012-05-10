package main;

import com.google.common.eventbus.EventBus;
import com.google.inject.Guice;
import com.google.inject.Injector;

import dependency.injection.RestModule;
import events.ServerSignals;

import server.ClueServer;

/**
 * @author matt
 * 
 */
public class ClueMain {

	public static void main(final String args[]) throws Exception {
		// Gets the injector for our context
		// TODO: Wrap the injector into a singleton we can use to inject anywhere
		Injector injector = Guice.createInjector(new RestModule());
		
		// Gets an instance of the server from the injector
		injector.getInstance(ClueServer.class).start();
		
		// Gets a handle to the event bus from the injector
		final EventBus eventBus = injector.getInstance(EventBus.class);

		// Allows the server to be stopped by entering quit into the console
		// TODO: could be extracted to a more complex class that could listen on
		// multiple streams
		new ConsoleControl(System.in, new InputListener() {
			@Override
			public boolean lineRead(String input) {
				// Check for user input of quit
				if("quit".equals(input)) {
					try {
						// Post an event to the event bus
						eventBus.post(ServerSignals.getStopSignal());
						return true;
					} catch (Exception e) {
						// TODO: Better exception handling
						e.printStackTrace();
					}
				}
				
				return false;
			}
		}).listenForInput();
	}
}
