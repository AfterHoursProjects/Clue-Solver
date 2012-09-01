package server;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.restlet.service.TaskService;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

import events.ServerSignals;

// Warnings suppressed in this class because they are caused by the TaskService interface
@SuppressWarnings({ "rawtypes", "unchecked" })
public class ClueTaskService extends TaskService {
	private final ExecutorService executor;
	private final EventBus eventBus;

	@Inject
	public ClueTaskService(final ExecutorService executor, final EventBus eventBus) {
		this.executor = executor;
		this.eventBus = eventBus;

		// Register ourselves as a listener for events
		eventBus.register(this);
	}

	@Override
	public boolean awaitTermination(final long timeout, final TimeUnit unit) throws InterruptedException {
		return executor.awaitTermination(timeout, unit);
	}

	@Override
	public void execute(final Runnable command) {
		executor.execute(command);
	}

	@Override
	public List invokeAll(final Collection tasks) throws InterruptedException {
		return executor.invokeAll(tasks);
	}

	@Override
	public List invokeAll(final Collection tasks, final long timeout, final TimeUnit unit) throws InterruptedException {
		return executor.invokeAll(tasks, timeout, unit);
	}

	@Override
	public Object invokeAny(final Collection tasks) throws InterruptedException, ExecutionException {
		return executor.invokeAny(tasks);
	}

	@Override
	public Object invokeAny(final Collection tasks, final long timeout, final TimeUnit unit)
			throws InterruptedException, ExecutionException, TimeoutException {
		return executor.invokeAny(tasks, timeout, unit);
	}

	@Override
	public boolean isShutdown() {
		return executor.isShutdown();
	}

	@Override
	public boolean isTerminated() {
		return executor.isTerminated();
	}

	@Subscribe
	public void onStop(ServerSignals.StopSignal signal) {
		try {
			eventBus.unregister(this);
			this.shutdown();
		} catch (final Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void shutdown() {
		executor.shutdown();
	}

	@Override
	public List<Runnable> shutdownNow() {
		return executor.shutdownNow();
	}

	@Override
	public <T> Future<T> submit(final Callable<T> task) {
		return executor.submit(task);
	}

	@Override
	public Future<?> submit(final Runnable task) {
		return executor.submit(task);
	}

	@Override
	public <T> Future<T> submit(final Runnable task, final T result) {
		return executor.submit(task, result);
	}
}
