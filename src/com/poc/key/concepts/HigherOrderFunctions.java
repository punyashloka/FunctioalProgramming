package com.poc.key.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HigherOrderFunctions {

	public static void main(String[] args) {
		//takes a function (method) as parameter,
		// or returns a function after its execution
		
		List<String> list = new ArrayList<>();
		list.add("One");
		list.add("Abc");
		list.add("BCD");
		
		Collections.sort(list, (String a, String b) -> { // second parameter is a lambda (function)
		    return a.compareTo(b);
		});
		System.out.println(list);  
		
		
		Comparator<String> comparator = (String a, String b) -> { //lambda expression that implements the Comparator interface
		    return a.compareTo(b);
		};
		Comparator<String> comparatorReversed = comparator.reversed(); // reversed() method returns a lambda (function)
																	   // function that returns another function
		Collections.sort(list, comparatorReversed);
		System.out.println(list);
		
	}

}
