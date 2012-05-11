package dependency.injection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

import main.input.ConsoleControl;
import main.input.InputListener;
import main.input.UserInputListener;

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

	@Override
	protected void configure() {
		bind(EventBus.class).toInstance(new EventBus());

		// This binding is used to set the port number, could be modified to something that
		// read an external config file, command line argument, jvm argument, etc
		bind(Integer.class).annotatedWith(Names.named("serverPort")).toInstance(1234);

		// Arguments for the thread pool setup
		bind(Integer.class).annotatedWith(Names.named("coreThreadPoolSize")).toInstance(10);
		bind(Integer.class).annotatedWith(Names.named("maxThreads")).toInstance(30);
		bind(Integer.class).annotatedWith(Names.named("extraThreadsTimeout")).toInstance(10);

		// Creates the blocking queue for jobs waiting to execute
		BlockingQueue<Runnable> blockingQueue = Queues.newLinkedBlockingQueue(500);
		bind(new TypeLiteral<BlockingQueue<Runnable>>() {
		}).annotatedWith(Names.named("threadQueue")).toInstance(blockingQueue);

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
