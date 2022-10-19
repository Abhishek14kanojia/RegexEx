package com.regexEx;
import java.util.Scanner;
public class Main extends Details{
	
	
	static Scanner sc = new Scanner(System.in);
	static String firstname;
	static String lastname;
	static String email;
	static String MobileNo;
	static String password;
	
	
	public static void main(String[] args) {
		System.out.println("welcome to the user registration problem");
		userFirstname();
		userLastname();
		userEmail();
		userMobileNo();
		userPassword();
	}

	public static void userFirstname() {
		System.out.println("Enter the first Name : ");
		firstname = sc.next();
		Details.validFirstName(firstname);
	}
	public static void userLastname() {
		System.out.println("Enter the last Name : ");
		lastname = sc.next();
		Details.vaildLastName(lastname);
	}
	public static void userEmail() {
		System.out.println("Enter the your Email : ");
		email = sc.next();
		Details.validEmain(email);
	}
	public static void userMobileNo(){
		System.out.println("Enter the your Mobile Number : ");
		MobileNo = sc.next();
		Details.validMobileno(MobileNo);
	}
	public static void userPassword() {
		System.out.println("Enter the your Password : ");
		password = sc.next();
		Details.vaildPassword(password);
	}
}   
