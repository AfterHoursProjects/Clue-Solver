package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleControl {
	private final BufferedReader in;
	private final InputListener listener;

	public ConsoleControl(InputStream in, InputListener listener) {
		final InputStreamReader converter = new InputStreamReader(in);
		this.in = new BufferedReader(converter);
		this.listener = listener;
	}

	/**
	 * Spins listening for input, once a whole line is read it gets passed on to the listeners
	 * {@link InputListener#lineRead(String)} method
	 * 
	 * @throws IOException
	 *             an exception occurs while reading from the input stream used to construct this instance
	 */
	public void listenForInput() throws IOException {
		while (listener.lineRead(in.readLine()) == false) {
		}
	}
}
