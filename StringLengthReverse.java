package com.vstl.stringMethods;

public class StringLengthReverse {
	
	
 public String stringreverseandlength() {
		
	String stringvalue = "Check the string reverse";  
	int intsizeofstringvalue = stringvalue.length();  
	  
	System.out.println("Reverse string: " + stringvalue + " is");  
	System.out.println("length of string is " +intsizeofstringvalue);
	
	for(int intloop = 0; intloop < intsizeofstringvalue; intloop++)  
	{  

		System.out.print(stringvalue.charAt(stringvalue.length() - intloop - 1));  

	}
	return stringvalue;  
 }
}