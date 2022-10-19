package com.regexEx;

import java.util.ArrayList;
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
	public static void validEmain(String Email) {
		String regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(Email);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}	
	}
	public static void validMobileno(String mobileNo) {
		String regex = "^[91][_.][6-9]?[\\d]{9}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(mobileNo);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}	
		
	}
	public static void validPassword(String password) {
		String regex =  "^[0-9 a-z A-Z @]{8,}$";
		Pattern pt = Pattern.compile(regex);
		Matcher mc = pt.matcher(password);
		
		if(mc.matches()) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
	}
}
	public static void vaildAllEmails(String password) {
		ArrayList<String> email = new ArrayList<>();
		// vaild Emails
		email.add("abhishek14kanojia@gmail.com");
		email.add("abc@yahoo.com,");
		email.add("abc-100@yahoo.com,");
		email.add("abc.100@yahoo.com");
		email.add("abc111@abc.com,");
		email.add("abc-100@abc.net,");
		email.add("abc.100@abc.com.au");
		email.add("abc@1.com,");
		email.add("abc@gmail.com.com");
		email.add("abc+100@gmail.com");
		
		// invalid
		
		email.add("abcgmail.com");
		email.add("abc@.com.my");
		email.add("abc123@.com");
		email.add("abc123@.com.com");
		email.add("abc123@gmail.a");
		email.add("abc()*@gmail.com");
		email.add("abc@%*.com");
		email.add("abc@abc@gmail.com");
		email.add("abc@gmail.com.1a");
		email.add(".abc@abc.com");
		email.add("abc@gmail.com.aa.au");
		
		 String regex = "^[a-z]+[a-z0-9+_.-]*[@][a-z0-9]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
		Pattern pt = Pattern.compile(regex);
		for(String emails : email) {
			Matcher mc = pt.matcher(emails);
			System.out.println(emails + mc.matches());
		}
	}
}
