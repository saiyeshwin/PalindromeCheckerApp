// Use Case-04: Character Array-Based Palindrome Check
// This class converts a string to a character array and compare characters
// It uses two pointers
// @author Developer
// @version 4.0
package com.seveneleven.palindromecheckerapp;
import java.util.Scanner;
public class UseCaseFourPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String input=sc.next();
		// Convert string to it's character array
		char[] charArray=input.toCharArray();
		//Initialize pointers start and end
		int start=0;
		int end=charArray.length-1;
		// Flag which assumes the string is palindrome initially
		boolean isPalindrome=true;
		// Continue comparison until pointers cross eachother
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		// Display result accordingly
		if(isPalindrome) 
			System.out.println("Is it a palindrome? True");
		else 
			System.out.println("Is it a palindrome? False");
	}
}
