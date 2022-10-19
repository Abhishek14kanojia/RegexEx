package com.regexEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Details {
	public static void validFirstName(String firstname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(firstname);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
	
	public static void vaildLastName(String lastname) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(lastname);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
		
		
}
