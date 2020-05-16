package com.accolite.p6;

public class ExcelHeader {

	public static void main(String[] args) {
		System.out.println(titleToNumber("Z"));

	}

	static int titleToNumber(String s) 
	{ 
	    // This process is similar to  
	    // binary-to-decimal conversion 
	    int result = 0; 
	    for (int i = 0; i < s.length(); i++) 
	    { 
	        result *= 26; 
	        result += s.charAt(i) - 'A' + 1; 
	    } 
	    return result; 
	} 
}
