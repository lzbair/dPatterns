package io.patterns.state;

public final class TCPConnection {

    public static final String OK = "OK";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    private TCPConnectionState state;

    public TCPConnection(TCPConnectionState state) {
        this.state = state;
    }

    public enum TCPConnectionState {
        ESTABLISHED, CLOSED;
    }

    public TCPResponce reply(TCPRequest request) {
        switch (state) {
        case CLOSED:
            return new TCPResponce(TCPConnection.UNAVAILABLE);

        default:
            return new TCPResponce(TCPConnection.OK);
        }
    }
}
