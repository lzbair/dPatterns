package io.patterns.state;

public class TCPListen extends TCPState {

	@Override
	public TCPState close() {
		throw  new UnsupportedOperationException();

	}

	@Override
	public TCPState open() {
		return new TCPEstablished();
	}

}
