package dependency.injection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

import main.input.ConsoleControl;
import main.input.InputListener;
import main.input.UserInputListener;

import org.apache.commons.configuration.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.restlet.service.TaskService;

import server.ClueServer;
import server.ClueTaskService;

import com.google.common.collect.Queues;
import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

import dependency.providers.ClueServerProvider;
import dependency.providers.ConsoleControlProvider;
import dependency.providers.ExecutorServiceProvider;

/**
 * Guice module for setting up dependencies. Think of it as a spring context just done in Java code
 * 
 * @author matt
 * 
 */
public class RestModule extends AbstractModule {
	private final Logger log = LogManager.getLogger(RestModule.class);
	private final Configuration config;

	public RestModule(Configuration config) {
		this.config = config;
	}

	@Override
	protected void configure() {
		bind(EventBus.class).toInstance(new EventBus());

		// This binding is used to set the port number, could be modified to something that
		// read an external config file, command line argument, jvm argument, etc
		final int serverPort = config.getInt("serverPort");
		bind(Integer.class).annotatedWith(Names.named("serverPort")).toInstance(serverPort);
		log.info("Bound server to port {}", serverPort);

		// Arguments for the thread pool setup
		bind(Integer.class).annotatedWith(Names.named("coreThreadPoolSize")).toInstance(config.getInt("coreThreadPoolSize"));
		bind(Integer.class).annotatedWith(Names.named("maxThreads")).toInstance(config.getInt("maxThreads"));
		bind(Integer.class).annotatedWith(Names.named("extraThreadsTimeout")).toInstance(config.getInt("extraThreadsTimeout"));

		// Creates the blocking queue for jobs waiting to execute
		final BlockingQueue<Runnable> blockingQueue = Queues.newLinkedBlockingQueue(config.getInt("maxWaiting"));
		bind(new TypeLiteral<BlockingQueue<Runnable>>() {}).annotatedWith(Names.named("threadQueue")).toInstance(blockingQueue);

		// Setup the executor service which should manage all application threads
		bind(ExecutorService.class).toProvider(ExecutorServiceProvider.class).in(Scopes.SINGLETON);

		// Setup the task executor service, this wraps up the executor service into the restlet task service interface
		bind(TaskService.class).to(ClueTaskService.class).in(Scopes.SINGLETON);

		// Binds the ClueServer class to the ClueServer builder
		bind(ClueServer.class).toProvider(ClueServerProvider.class).in(Scopes.SINGLETON);

		// Binds the user input listener
		bind(InputListener.class).to(UserInputListener.class).in(Scopes.SINGLETON);

		// Binds the console controller
		bind(ConsoleControl.class).toProvider(ConsoleControlProvider.class).in(Scopes.SINGLETON);
	}
}
