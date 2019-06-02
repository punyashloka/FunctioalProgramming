package com.poc.key.concepts;

import java.util.Arrays;
import java.util.List;

public class LambdaVsClosure {
	private static int fac = 2;
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3});
		numbers.stream().map(e -> e *2).forEach(System.out::println); //Pure
		
		// no Pure
		 int factor = 2;
		int[] intarr = new int[]{0};
		numbers.stream().map(e -> e * factor).forEach(System.out::println);
		//factor = 4;
		//The final local variable factor cannot be assigned. It must be blank and not using a compound assignment
		//Local variable factor defined in an enclosing scope must be final or effectively final
		
		numbers.stream().map(e -> e * intarr[0]).forEach(System.out::println);
		intarr[0] = 1; // no complain
		
		numbers.stream().map(e -> e * fac).forEach(System.out::println);
		fac = 25;// no complain
	}

}
