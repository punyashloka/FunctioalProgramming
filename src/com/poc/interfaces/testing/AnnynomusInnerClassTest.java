package com.poc.interfaces.testing;

import com.poc.interfaces.Interf1;

public class AnnynomusInnerClassTest {
	
	private int x = 999;
	public void m1(){
	Interf1 interf1 = new Interf1(){
		 int x = 888;
		@Override
		public void printMessage() {
			System.out.println("X : " + this.x);
			
		}
	};
	interf1.printMessage();
	}
	public void m2(){
		Interf1 interf1 = ()  -> {
			 int x = 888;
			 System.out.println("X : " + this.x);
		};
		interf1.printMessage();
		}
	public static void main(String[] args) {
		
		AnnynomusInnerClassTest test = new AnnynomusInnerClassTest();
		test.m1();
		test.m2();
	}

}
