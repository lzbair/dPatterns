package io.patterns.state;

public class TCPEstablished extends TCPState {

	

	@Override
	public TCPState close() {
		return new TCPListen();

	}

	@Override
	public TCPState open() {
		throw  new UnsupportedOperationException();
	}

}
