package main.input;

public interface InputListener {
	/**
	 * Method to call when a line is read from the console
	 * 
	 * @return return a true to stop the controller, return false to keep the controller going
	 */
	boolean lineRead(String input);
}
