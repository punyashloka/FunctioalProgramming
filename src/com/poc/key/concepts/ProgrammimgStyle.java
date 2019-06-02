package com.poc.key.concepts;

import java.util.Arrays;
import java.util.List;

public class ProgrammimgStyle {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10});
		
		//The imperative style
		//complex but familiar
		for (int i = 0; i<= numbers.size(); i++){
			System.out.println(i);
		}
		
		
		//declarative 
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
		
		// The functional style
		numbers.forEach((Integer e) -> System.out.println(e));
		
		// as list of integer. type not required
		//Type Interference 
		numbers.forEach((e) -> System.out.println(e));
		
		//numbers.forEach((e) -> System.out.println(e.foo()));
		
		numbers.forEach(e -> System.out.println(e));
		//method references
		numbers.forEach(System.out::println);
		
		
		
		
		
	}
}
