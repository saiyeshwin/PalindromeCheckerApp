// Use Case-07: Deque-Based Optimized Palindrome Checker
// This class validates a palindrome using deque(double ended queue)
// Characters are inserted into deque and compared by removing elements from both ends
// @author Developer
// @version 7.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseSevenPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		Deque<Character> deque=new ArrayDeque<>();
		//Adding each character to the deque
		for(char c:input.toCharArray()) {
			deque.add(c);
		}
		//Flag to track the palindrome
		boolean isPalindrome=true;
		//Continue comparison while more than one element exists
		while(deque.size()>1) {
			if(deque.removeFirst()!=deque.removeLast()) {
				isPalindrome=false;
			}
		}
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}