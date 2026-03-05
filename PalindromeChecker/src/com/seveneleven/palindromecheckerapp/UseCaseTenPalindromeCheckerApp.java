// Use Case-10:Case-Insensitive & Space-Ignored Palindrome
// This class validates a palindrome after preprocessing the string
// Normalization includes removing spaces, symbols and converting to lowercase
// @author Developer
// @version 10.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseTenPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		// Create a normalized string of input by removing spaces, symbols and converting to lowercase
		String normalized=input.trim().toLowerCase().replaceAll("[^a-z0-9]", "");
		//Flag to track the palindrome
		boolean isPalindrome=true;
		for(int i=0;i<normalized.length()/2;i++) {
			if(normalized.charAt(i)!=normalized.charAt(normalized.length()-i-1)) {
				isPalindrome=false;
			}
		}
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}