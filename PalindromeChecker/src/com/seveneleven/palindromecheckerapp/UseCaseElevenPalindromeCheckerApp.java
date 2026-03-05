// Use Case-11: Object-Oriented Palindrome Service
// This class demonstrates palindrome check using object oriented design
// Palindrome logic is encapsulated inside a palindrome service class
// Improves reusability, readability
// @author Developer
// @version 11.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseElevenPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		// Create an object service of PalindromeService
		PalindromeService service=new PalindromeService();
		//Flag to track the palindrome
		boolean isPalindrome=service.checkPalindrome(input);
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}
// Service class that contains the palindrome logic
class PalindromeService{
	// Takes an input string and checks whether it's a palindrome or not
	public boolean checkPalindrome(String input) {
		//Initialize pointers
		int start=0;
		int end=input.length()-1;
		//Compare characters moving inward
		while(start<end) {
			if(input.charAt(start)!=input.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}