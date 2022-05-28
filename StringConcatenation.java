package com.vstl.stringMethods;

public class StringConcatenation {

	String stringfirstname = "Verve";
	String stringlastname = "Square";
	
	 public String concatmethod() {
		
		String stringname = stringfirstname.concat(stringlastname);
		System.out.println(stringname);
		return stringname;
	}

	public String stringbuildermethod() {
		
		StringBuilder stringbuilderfirstname = new StringBuilder("Verve");
		StringBuilder stringbuilderlastname = new StringBuilder("Square");
		
		StringBuilder stringbuildername = stringbuilderfirstname.append(stringbuilderlastname);
		
		System.out.println("Stringbuilder : \t" +stringbuildername);
		return null;
		
	}
}
