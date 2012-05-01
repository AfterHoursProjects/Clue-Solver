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

		synchronized (Thread.currentThread()) {
			Thread.currentThread().wait();
		}

		server.stop();
	}
}
