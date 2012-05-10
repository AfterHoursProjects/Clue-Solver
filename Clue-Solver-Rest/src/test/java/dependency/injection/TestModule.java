package dependency.injection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Module that overrides the port number in the main module so that we can
 * run both server and junits at the same time
 * @author matt
 *
 */
public class TestModule extends AbstractModule{

	@Override
	protected void configure() {
		// TODO: Move to a port selector that try several ports till it finds an open one
		bind(Integer.class).annotatedWith(Names.named("serverPort")).toInstance(6110);		
	}

}
