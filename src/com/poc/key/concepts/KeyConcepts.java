package com.poc.key.concepts;

import com.poc.interfaces.MyComparator;

/*
 * name
 * return type
 * parameters
 * body
 */
public class KeyConcepts {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
					System.out.println("In Another Child Thread");
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		
		
		Thread t1 = new Thread (() -> System.out.println("In Another Functional Child Thread"));
		t1.start();
		
		//Returning a Value From a Lambda Expression
		MyComparator m =  (a1, a2) -> a1 > a2;
		System.out.println(m.compare(10, 250));
	}

}
