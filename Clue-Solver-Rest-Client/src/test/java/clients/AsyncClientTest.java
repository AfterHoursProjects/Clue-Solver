package clients;

import static org.junit.Assert.assertFalse;

import java.util.List;

import model.Triple;

import org.junit.Test;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

public class AsyncClientTest {

	@Test
	public void testGetRemaining() {
		AsyncClient client = ClueClients.newAsyncClient("http:\\localhost:1234");
		ListenableFuture<List<Triple>> triples = client.getRemainingTriples();
		assertFalse(Futures.get(triples, RuntimeException.class).isEmpty());
	}
}
