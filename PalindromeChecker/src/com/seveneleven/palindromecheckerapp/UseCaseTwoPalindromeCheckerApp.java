package com.seveneleven.palindromecheckerapp;
//Use Case-02:Print a Hardcoded Palindrome Result
//This class demonstrates basic palindrome validation using a hardcoded string value.
// It compares characters from both ends
//@author Developer
//@version 2.0

public class UseCaseTwoPalindromeCheckerApp {
	public static void main(String[] args) {
		String input="malayalam";
		System.out.println("Input text:"+input);
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)!=input.charAt(input.length()-i-1)) {
				System.out.println("Is it a palindrome? False");
				return;
			}
		}
		System.out.println("Is it a palindrome? True");
	}
}
