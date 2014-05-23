package io.patterns.state;

public abstract class TCPState {
	
	public abstract TCPState open();
	public abstract TCPState close();

}
