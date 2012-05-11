package dependency.providers;

import org.restlet.service.TaskService;

import server.ClueServer;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class ClueServerProvider implements Provider<ClueServer> {
	private final int port;
	private final EventBus eventBus;
	private final TaskService taskService;

	@Inject
	public ClueServerProvider(@Named("serverPort") int port, EventBus eventBus, TaskService taskService) {
		this.port = port;
		this.eventBus = eventBus;
		this.taskService = taskService;
	}

	@Override
	public ClueServer get() {
		// Create the clue server
		final ClueServer server = new ClueServer(port, eventBus, taskService);

		// Register as listeners for events when creating the instances
		eventBus.register(taskService);

		return server;
	}

}
