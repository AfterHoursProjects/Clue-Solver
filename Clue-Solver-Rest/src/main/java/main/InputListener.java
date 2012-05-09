package main;

public interface InputListener {
	/**
	 * Called everytime a line is read from the input stream
	 * @return return a true to stop the controller, return false to keep the controller going
	 */
	public boolean lineRead(String input);
}
