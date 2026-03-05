// Use Case-13:Performance Comparison
// This class measures and compares the execution performance of palindrome algorithms
// Captures execution start and end times
// Calculates total execution duration
// Displays benchmarking results
// @author Developer
// @version 13.0
package com.seveneleven.palindromecheckerapp;
import java.util.*;
public class UseCaseThirteenPalindromeCheckerApp {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string:");
	    String input = sc.next();
	    // List of strategies to test
	    List<PalindromeStrategy> strategyList = Arrays.asList(
	        new CharacterArrayStrategy(),
	        new StackStrategy(),
	        new DequeStrategy(),
	        new QueueStackStrategy(),
	        new LinkedListStrategy()	        
	    );
	    // Run each strategy and measure performance
	    for (PalindromeStrategy strategy:strategyList) {
	        long start=System.nanoTime();
	        boolean isPalindrome=strategy.check(input);
	        long duration=System.nanoTime()-start;
	        System.out.println(strategy.getClass().getSimpleName() );
	        System.out.println("Is palindrome? "+isPalindrome );         
	        System.out.println("Duration:"+duration+" ns");
	        System.out.println();
	    }
	}
}
//  PalindromeStrategy interface with check function
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
//Provides a queue and stack based implementation of PalindromeStrategy interface
class QueueStackStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		Queue<Character> queue=new LinkedList<>();
		Stack<Character> stack=new Stack<>();
		//Adding each character to the queue and stack
		for(char c:input.toCharArray()) {
			queue.add(c);
			stack.push(c);
		}
		// Characters are compared by removing from front of queue and top of stack
		while(!queue.isEmpty()) {
			if(queue.poll()!=stack.pop()) {
				return false;
			}
		}
		return true;
	}
}
//Provides a linked list based implementation of PalindromeStrategy interface
class LinkedListStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		LinkedList<Character> list=new LinkedList<>();
		//Adding each character to the list
		for(char c:input.toCharArray()) {
			list.add(c);
		}
		//Continue comparison while more than one element exists
		while(list.size()>1) {
			if(list.removeFirst()!=list.removeLast()) {
				return false;
			}
		}
		return true;
	}
}
//Provides a char array based implementation of PalindromeStrategy interface
class CharacterArrayStrategy implements PalindromeStrategy{
	public boolean check(String input) {
		// Convert string to it's character array
		char[] charArray=input.toCharArray();
		//Initialize pointers start and end
		int start=0;
		int end=charArray.length-1;
		// Continue comparison until pointers cross eachother
		while(start<end) {
			if(charArray[start]!=charArray[end]) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}