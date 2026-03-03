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
		char[] charArray=input.toCharArray();
		int start=0;
		int end=charArray.length-1;
		boolean isPalindrome=true;
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome) 
			System.out.println("Is it a palindrome? True");
		else 
			System.out.println("Is it a palindrome? False");
	}
}
