package io.patterns.singleton;

public final class Writer {

	private Writer() {
	}

	public static synchronized void write() {
		WriterHolder.INSTANCE.doWrite();
	}
	
	private static class WriterHolder {
		public static final Writer INSTANCE = new Writer();
	}

	private void doWrite() {
		System.out.println(Thread.currentThread().getId());
	}

}
