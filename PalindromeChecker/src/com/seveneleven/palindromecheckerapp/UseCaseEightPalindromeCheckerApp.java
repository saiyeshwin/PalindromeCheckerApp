// Use Case-08: Linked List-Based Palindrome Checker
// This class validates a palindrome using a linked list
// Characters are inserted into list and compared by removing elements from both ends
// @author Developer
// @version 8.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseEightPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		LinkedList<Character> list=new LinkedList<>();
		//Adding each character to the list
		for(char c:input.toCharArray()) {
			list.add(c);
		}
		//Flag to track the palindrome
		boolean isPalindrome=true;
		//Continue comparison while more than one element exists
		while(list.size()>1) {
			if(list.removeFirst()!=list.removeLast()) {
				isPalindrome=false;
			}
		}
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}