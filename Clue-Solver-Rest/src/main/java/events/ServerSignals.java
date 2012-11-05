package events;

/**
 * Container class for possible events related to server
 * 
 * @author matt
 * 
 */
public abstract class ServerSignals {
	public static final class StopSignal {
		private StopSignal() {
		}
	};

	private static final StopSignal STOP_SIGNAL = new StopSignal();

	/**
	 * @return A signal for to notify stopping of server
	 */
	public static StopSignal getStopSignal() {
		return STOP_SIGNAL;
	}
}
