package dependency.providers;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class ExecutorServiceProvider implements Provider<ExecutorService> {
	private final int coreThreads;
	private final int maxThreads;
	private final int timeout;
	private final BlockingQueue<Runnable> threadQueue;

	@Inject
	public ExecutorServiceProvider(@Named("coreThreadPoolSize") int coreThreads, @Named("maxThreads") int maxThreads,
			@Named("extraThreadsTimeout") int timeoutMins, @Named("threadQueue") BlockingQueue<Runnable> threadQueue) {
		this.coreThreads = coreThreads;
		this.maxThreads = maxThreads;
		this.timeout = timeoutMins;
		this.threadQueue = threadQueue;
	}

	@Override
	public ExecutorService get() {
		return new ThreadPoolExecutor(coreThreads, maxThreads, timeout, TimeUnit.MINUTES, threadQueue);
	}

}
