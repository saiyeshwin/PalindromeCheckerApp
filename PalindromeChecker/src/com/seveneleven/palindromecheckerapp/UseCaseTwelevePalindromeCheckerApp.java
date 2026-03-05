// Use Case-12:Strategy Pattern for Palindrome Algorithms
// This class demonstrates how different plaindrome validation algorithms
//  can be selected dynamically at run time using strategy pattern

// No performance comparison is done in this usecase
// The focus is purely on algorithm interchangability
// @author Developer
// @version 12.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseTwelevePalindromeCheckerApp {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String input=sc.next();
	    // User chooses a strategy
	    PalindromeStrategy strategy;
	    System.out.println("Select strategy: 1 for Stack, 2 for Deque");
	    int choice=sc.nextInt();
	    if(choice==1){
	        strategy=new StackStrategy();
	    } 
	    else{
	        strategy=new DequeStrategy();
	    }
	    // Use the chosen strategy
	    boolean isPalindrome = strategy.check(input);
	    System.out.println("Is palindrome?:"+isPalindrome);
	}

}

interface PalindromeStrategy{
	boolean check(String input);
}

// Provides a stack based implementation of PalindromeStrategy interface
class StackStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		Stack<Character> stack=new Stack<>();
		//Adding each character to the stack
		for(char c:input.toCharArray()) {
			stack.add(c);
		}
		// Compare original sequence with the pop order
		for(char c:input.toCharArray()) {
			if(c!=stack.pop()) {
				return false;
			}
		}
		return true;
	}
}

//Provides a deque based implementation of PalindromeStrategy interface
class DequeStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		Deque<Character> deque=new ArrayDeque<>();
		//Adding each character to the deque
		for(char c:input.toCharArray()) {
			deque.add(c);
		}
		//Continue comparison while more than one element exists
		while(deque.size()>1) {
			if(deque.removeFirst()!=deque.removeLast()) {
				return false;
			}
		}
		return true;
	}
}