package com.vstl.stringMethods;

public class StringMethods {

	String stringtotest = " Program to Check String Methods ";
	
	public String upperandlowercase() {
		
		System.out.println(stringtotest.toUpperCase());
		System.out.println(stringtotest.toLowerCase() + "\n");
		return null;
	
	} 

	// String Trim eliminates whitespace in front and end of the string
	public String stringtrim() {
		
		String stringtrimtest = stringtotest.trim();
		System.out.println("String Trim:" +stringtrimtest+"end\n");
		return null;
	
	}
	
	//String startsWith and endsWith returns true or false. so type is boolean 
	public String stringstartandendswith() {
		
		String stringvalue = "Program to Check";
		boolean booleanendswith = stringvalue.endsWith("ck"); 
		boolean booleanstartswith = stringvalue.startsWith("Pr");
		System.out.println("String endswith " +booleanendswith);
		System.out.println("String startswith " +booleanstartswith+ "\n");
		return null;
	}

	public String stringreplace() {
		
		String stringreplacevalue = stringtotest.replace("Check", "test"); 
		System.out.println("String Replace " +stringreplacevalue+ "\n");
		return null;
		
	}
	
	public String stringreplaceall() {
		
		String stringreplacechar = stringtotest.replaceAll("o", "a");
		String stringreplacesword = stringtotest.replaceAll("to", "for");
		String stringreomvewhitespace = stringtotest.replaceAll("\\s", "");
		System.out.println("String replace all Character : " +stringreplacechar);
		System.out.println("Replace all word : " +stringreplacesword);
		System.out.println("Remove White Space : " +stringreomvewhitespace+ "\n");
		return null;
	}
	
	//returns the index value of string. 
	@SuppressWarnings("unused")
	public String stringindexof() {
		
		int stringindexofchar = stringtotest.indexOf("to");
		
		System.out.println("Index of Char : " +stringindexofchar);
		
		for (int intindex = stringtotest.indexOf("a", 0); intindex>=0; intindex++)
		{
			System.out.println(intindex);
			System.out.println("Original String :" +stringtotest);
			System.out.println("O char comes " +intindex+ " times\n");
			break;
		}
		
		return null;
		
	}
	public String stringcontains() {
		
		boolean booleancontainvalue = stringtotest.contains("Check"); 
		System.out.println("String Contains Method");
		System.out.println("String contains " +booleancontainvalue);
		if (stringtotest.contains("String Methods"))
		{
			System.out.println("String Methods exist in given string\n");
		} else
		{
			System.out.println("String Methods is not exist.\n");
		}
		return null;
		
	}

	public void stringisempty() {
		
		String stringemptyvalue = "";
	
		if (stringtotest.isEmpty() == false)
		{
			System.out.println("String public declaration value is full");
			if (stringemptyvalue.isEmpty() == true)
			{
				System.out.println("String value is empty, method returns true");
			} else
			{
				System.out.println("String value is not empty, method returns false");
			}
		}
	}

}













