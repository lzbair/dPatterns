package io.patterns.state;

import io.patterns.state.TCPConnection.TCPConnectionState;

import org.junit.Assert;
import org.junit.Test;

public class TCPConnectionTest {

    @Test
    public void testIfTCPConnectionIsEstablished() {
        final TCPConnection connection = new TCPConnection(TCPConnectionState.ESTABLISHED);
        final TCPResponce responce = connection.reply(new TCPRequest("Hello"));
        Assert.assertEquals(TCPConnection.OK, responce.toString());
    }

    @Test
    public void testIfTCPConnectionIsDown() {
        final TCPConnection connection = new TCPConnection(TCPConnectionState.CLOSED);
        final TCPResponce responce = connection.reply(new TCPRequest("Hello"));
        Assert.assertEquals(TCPConnection.UNAVAILABLE, responce.toString());
    }

    @Test
    public void testIfTCPConnection() {
        final TCPConnection connection = new TCPConnection(TCPConnectionState.CLOSED);
        final TCPResponce responce = connection.reply(new TCPRequest("Hello"));
        Assert.assertEquals(TCPConnection.UNAVAILABLE, responce.toString());
    }
}
