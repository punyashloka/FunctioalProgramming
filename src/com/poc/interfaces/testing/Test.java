package com.poc.interfaces.testing;

import java.util.stream.IntStream;

import com.poc.interfaces.Interf1;
import com.poc.interfaces.Interf2;
import com.poc.interfaces.Interf3;
import com.poc.interfaces.prior.java8.Implementation1;

public class Test {

	public static void main(String[] args) {
		/*Interf1 interf1 = new Implementation1();
		interf1.printMessage();
		
		interf1 = () -> System.out.println("Hello World!!! Welcome to JAVA 8");
		interf1.printMessage();
		
		Interf2 interf2 = (a,b) -> {return a+b ;};
		interf2 = (a, b) -> a + b;
		System.out.println(interf2.operation(10, 20));
		
		interf2 = (a, b) -> a * b;
		System.out.println(interf2.operation(10, 20));
		
		Interf3 interf3 = a ->  a* a ;
		System.out.println(interf3.sqrt(4));*/
		
		Runnable runaable = () -> {
			//IntStream.range(0, 20).boxed().forEachOrdered(System.out.println("Hello"));
			IntStream.range(0, 10).forEach(
					nbr -> System.out.println("child thread" + nbr));
		};
	//	runaable.run();
		Thread t = new Thread(runaable);
		t.start();
		IntStream.range(0, 10).forEach(
				nbr -> System.out.println("main thread" + nbr));
	}

}
