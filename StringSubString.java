package com.vstl.stringMethods;

public class StringSubString {

	String stringtocheck = "Access specifiers, Loops, Training";
	
	String stringsubstringvalue = stringtocheck.substring(3, 10);
	
	public String substringverification() {
		
		System.out.println(stringtocheck);
		System.out.println("Substring with startindex" + stringtocheck.substring(11));
		System.out.println("SubString Value from index 3 to index 9 is"+stringsubstringvalue);
		
		return null;
	}
	
	public String stringsplitverification() {
		
		String[] stringarray = stringtocheck.split(",");
		
		for (int intlp = 0; intlp<=stringarray.length; intlp++) 
		{
			System.out.println(stringarray[intlp]);
		}
		return null;
		
	}
	}
