package dependency.providers;

import java.util.concurrent.ExecutorService;

import main.input.ConsoleControl;
import main.input.InputListener;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class ConsoleControlProvider implements Provider<ConsoleControl> {
	private final ExecutorService executor;
	private final InputListener listener;

	@Inject
	public ConsoleControlProvider(ExecutorService executor, InputListener listener) {
		this.executor = executor;
		this.listener = listener;
	}

	@Override
	public ConsoleControl get() {
		return new ConsoleControl(System.in, listener, executor);
	}

}
