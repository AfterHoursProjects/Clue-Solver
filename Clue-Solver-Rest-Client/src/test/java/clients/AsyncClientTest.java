package clients;

import static org.junit.Assert.assertFalse;

import java.util.List;

import model.Triple;
import models.User;

import org.junit.Ignore;
import org.junit.Test;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

public class AsyncClientTest {

	@Test
	@Ignore("No code behind this yet, test is being used to design API")
	public void testGetRemaining() {
		final User user = null;
		final AsyncClient client = ClueClients.newAsyncClient("http:\\localhost:1234", user);
		final ListenableFuture<List<Triple>> triples = client.getRemainingTriples();
		assertFalse(Futures.get(triples, RuntimeException.class).isEmpty());
	}
}
