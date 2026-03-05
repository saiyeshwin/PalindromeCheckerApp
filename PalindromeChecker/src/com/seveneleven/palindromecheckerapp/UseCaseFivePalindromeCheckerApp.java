// Use Case-05:  Stack-Based Palindrome Checker
// This class validates a palindrome using stack which follows a LIFO principle
// Push characters into stack, pop in reverse order, compare with original sequence and display result
// @author Developer
// @version 5.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseFivePalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		Stack<Character> stack=new Stack<>();
		//Adding each character to the stack
		for(char c:input.toCharArray()) {
			stack.add(c);
		}
		// Flag to track if it's a palindrome or not
		boolean isPalindrome=true;
		// Compare original sequence with the pop order
		for(char c:input.toCharArray()) {
			if(c!=stack.pop()) {
				isPalindrome=false;
				break;
			}
		}
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}
