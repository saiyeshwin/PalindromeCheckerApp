// Use Case-09:Recursive Palindrome Checker
// This class validates a palindrome using recursion
// Characters are compared from outer positions moving inwards using recursive calls
// Recursion stops when all characters matched or a mismatch is found
// @author Developer
// @version 9.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseNinePalindromeCheckerApp {
	// Recursive function which checks if a string is palindrome or not
	// Takes input string, starting index and ending index
	private static boolean check(String input,int start,int end) {
		if(start>=end) return true;
		if(input.charAt(start)!=input.charAt(end)) return false;
		return check(input,start+1,end-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		//Flag to track the palindrome
		boolean isPalindrome=check(input,0,input.length()-1);
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}