package io.patterns.state;

import org.junit.Assert;
import org.junit.Test;

public class TCPConnectionTest {

	@Test
	public void testConnectionSuccess() {
		final TCPConnection tcp = new TCPConnection();
		tcp.connect();
		tcp.disconnect();
		Assert.assertEquals(TCPConnection.ON, tcp.connect());
		Assert.assertEquals(TCPConnection.OFF, tcp.disconnect());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testConnectionFailure() {
		final TCPConnection tcp = new TCPConnection();
		tcp.connect();
		tcp.connect();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void testDisconnectionFailure() {
		final TCPConnection tcp = new TCPConnection();
		tcp.connect();
		tcp.disconnect();
		tcp.disconnect();
	}

}
