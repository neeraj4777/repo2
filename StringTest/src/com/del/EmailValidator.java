package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private Pattern pattern;
	private Matcher matcher;
	private String regex="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public EmailValidator() {
		pattern = Pattern.compile(regex);
	}
	private boolean validate(String input) {
		boolean valid = false;
	matcher = pattern.matcher(input);
	valid = matcher.matches();
		return valid;
	}
	
	public static void main(String[] args) {
		EmailValidator idv = new EmailValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the email");
		String input = scan.nextLine();
		boolean valid = idv.validate(input);
		System.out.println("email valid: " + valid);
		
	}

}
