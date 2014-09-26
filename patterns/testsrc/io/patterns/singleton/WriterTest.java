package io.patterns.singleton;

import java.lang.reflect.InvocationTargetException;

public class WriterTest {
	public static void main(String[] args) throws ClassNotFoundException,
			SecurityException, NoSuchMethodException, InstantiationException,
			IllegalAccessException, IllegalArgumentException,
			InvocationTargetException {
		/**
		 * Runnable r = () -> Writer.write(); Thread t1 = new Thread(r); Thread
		 * t2 = new Thread(r);
		 * 
		 * t1.start(); t2.start();
		 **/

		Class<?> w = Class.forName("io.patterns.singleton.Writer");
		w.getDeclaredConstructor().setAccessible(true);
		w.getDeclaredConstructor().newInstance();
	}
}
