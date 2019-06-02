package com.poc.interfaces.builtin;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class TestBuiltIn {
	public static void main(String[] args) {
		/*
		 * he Function interface represents a function (method) that takes a
		 * single parameter and returns a single value.
		 */
		Function<Integer, Integer> fun = (value) -> value + 3;
		Integer resultLambda = fun.apply(8);
		System.out.println("resultLambda = " + resultLambda);

		Function<Integer, String> fun1 = (value) -> (value * value) + "";
		String resultLambda1 = fun1.apply(8);
		System.out.println("resultLambda = " + resultLambda1);

		// Predicate
		/*
		 * takes a single value as parameter, and returns true or false
		 */
		Predicate<Integer> predicate = (value) -> value != null;
		System.out.println(predicate.test(8));
		System.out.println(predicate.test(null));

		// UnaryOperator
		/*
		 * single parameter and returns a parameter of the same type
		 */
		Person p = new Person("APJ", "Abdul", "Kalam");
		UnaryOperator<Person> unaryOperator = (person) -> {
			person.fullName = person.fName + " " + person.mName + " "
					+ person.lName;
			return person;
		};
		System.out.println(unaryOperator.apply(p).fullName);

		// BinaryOperator
		/*
		 * takes two parameters and returns a single value. Both parameters and
		 * the return type must be of the same type.
		 */
		
		BinaryOperator<Integer> binaryOperator =
		        (value1, value2) -> {  return Integer.max(value1, value2); };
		System.out.println(binaryOperator.apply(10, 20));
		
		//Supplier
		/*
		 * that represents an function that supplies a value of some sorts
		 */
		Supplier<Integer> supplier = () -> new Integer((int) (Math.random() * 1000D));
		System.out.println(supplier.get());
		
		//Consumer
		/*
		 * that consumes a value without returning any value. A Java Consumer
		 * implementation could be printing out a value, or writing it to a
		 * file, or over the network etc
		 */
		
		Consumer<Integer> consumer = (value) -> System.out.println(value);
		consumer.accept(10);
		
		
		
	}
}
