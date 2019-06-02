package com.poc.interfaces.testing;

import java.util.stream.IntStream;

public class RunnableTest {

	public static void main(String[] args) {
		
		Runnable runaable = () -> {
			IntStream.range(0, 10).forEach(
					nbr -> System.out.println("child thread" + nbr));
		};
		Thread t = new Thread(runaable);
		t.start();
		IntStream.range(0, 10).forEach(
				nbr -> System.out.println("main thread" + nbr));
		
		
		//
		Thread t1 = new Thread(() -> {
			IntStream.range(0, 10).forEach(
					nbr -> System.out.println("child thread" + nbr));
		});
	}

}
