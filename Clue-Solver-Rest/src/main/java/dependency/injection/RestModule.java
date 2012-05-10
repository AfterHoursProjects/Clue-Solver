package dependency.injection;

import server.ClueServer;
import server.ClueServerProvider;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

/**
 * Guice module for setting up dependencies.  Think of it as a spring context just done in Java code
 * @author matt
 *
 */
public class RestModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventBus.class).toInstance(new EventBus());
		bind(Integer.class).annotatedWith(Names.named("serverPort")).toInstance(1234);
		bind(ClueServer.class).toProvider(ClueServerProvider.class).in(Scopes.SINGLETON);
	}

}
