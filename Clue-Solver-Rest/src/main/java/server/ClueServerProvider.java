package server;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class ClueServerProvider implements Provider<ClueServer> {
	private final Integer port;
	private final EventBus eventBus;
	
	@Inject
	public ClueServerProvider(@Named("serverPort") Integer port, EventBus eventBus) {
		this.port = port;
		this.eventBus = eventBus;
	}

	@Override
	public ClueServer get() {
		ClueServer server = new ClueServer(port, eventBus);
		eventBus.register(server);
		return server;
	}

}
