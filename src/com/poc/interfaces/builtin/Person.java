package com.poc.interfaces.builtin;

public class Person {


	public String fName;
	public String mName;
	public String lName;
	public String fullName;
	public Person(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	
	@Override
	public String toString() {
		return "Person [fName=" + fName + ", mName=" + mName + ", lName="
				+ lName + ", fullNName=" + fullName + "]";
	}

}
