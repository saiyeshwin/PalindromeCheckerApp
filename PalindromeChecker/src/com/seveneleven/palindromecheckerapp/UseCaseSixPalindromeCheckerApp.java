// Use Case-06: Queue + Stack Based Palindrome Check
// This class validates a palindrome using stack and queue
// Stack follows LIFO principle
// Queue follow FIFO principle
// Characters are inserted into both stack and queue
// They are compared by removing from front of queue and top of stack
// @author Developer
// @version 6.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseSixPalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String input=sc.next();
		Queue<Character> queue=new LinkedList<>();
		Stack<Character> stack=new Stack<>();
		for(char c:input.toCharArray()) {
			queue.add(c);
			stack.add(c);
		}
		boolean isPalindrome=true;
		while(!queue.isEmpty()) {
			if(queue.poll()!=stack.pop()) {
				isPalindrome=false;
				break;
			}
		}
		System.out.print("Is palindrome?:"+isPalindrome);
	}
}