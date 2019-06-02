package com.poc.key.concepts;

import java.util.Arrays;
import java.util.List;

public class PureFunctions {

	public static void main(String[] args) {

		/*
		 * No state
		 * No side effects
		 * Immutable variables
		 * Favor recursion over looping
		 */
		
		/*
		 * how
		 * mutate
		 * side effect
		 * pass object
		 * 
		 */
		List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10});
		
		// same and same talk
		Integer sum = 0;
		for (Integer i : numbers) {
			if (i %2 == 0){
				sum += i * 2;	
			}
		}
		System.out.println(sum);
		
		/*
		 * what
		 * immutable
		 * no side effect
		 * Favor recursion over looping : Java Streams API.
		 * 
		 */
		System.out.println(numbers.stream()
				.filter(e -> e % 2 == 0)
				.mapToInt(e -> e * 2)
				.sum());
		
	}
	

}
