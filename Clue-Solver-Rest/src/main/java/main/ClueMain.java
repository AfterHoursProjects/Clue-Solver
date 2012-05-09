package main;

import server.ClueServer;

/**
 * @author matt
 * 
 */
public class ClueMain {

	public static void main(final String args[]) throws Exception {
		final ClueServer server = new ClueServer(1234);
		server.start();

		// Allows the server to be stopped by entering quit into the console
		// TODO: could be extracted to a more complex class that could listen on
		// multiple streams
		new ConsoleControl(System.in, new InputListener() {
			@Override
			public boolean lineRead(String input) {
				if("quit".equals(input)) {
					try {
						server.stop();
						return true;
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
				return false;
			}
		}).listenForInput();
	}
}
