package com.regexEx;
import java.util.Scanner;
public class Main extends Details{
	
	
	static Scanner sc = new Scanner(System.in);
	static String firstname;
	
	public static void main(String[] args) {
		System.out.println("welcome to the user registration problem");
		userFirstname();

	}

	public static void userFirstname() {
		System.out.println("Enter the first Name : ");
		firstname = sc.next();
		Details.validFirstName(firstname);
	}

}
