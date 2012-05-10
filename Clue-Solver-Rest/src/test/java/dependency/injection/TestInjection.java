package dependency.injection;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import server.ClueServer;

import com.google.common.eventbus.EventBus;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestInjection {

	@Test
	public void testSingletons() {
		Injector injector = Guice.createInjector(new RestModule());
		
		ClueServer firstServerInstance = injector.getInstance(ClueServer.class);
		assertTrue("Expected ClueServer.class to be a singleton", firstServerInstance == injector.getInstance(ClueServer.class));
		
		EventBus firstEventBusInstance = injector.getInstance(EventBus.class);
		assertTrue("Expected EventBus.class to be a singleton",firstEventBusInstance == injector.getInstance(EventBus.class));
	}
}
