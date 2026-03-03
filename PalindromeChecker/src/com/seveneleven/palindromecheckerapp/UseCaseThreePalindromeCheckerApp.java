// Use Case-03:Palindrome Check Using String Reverse
// This class checks whether a string is palindrome or not by reversing the string 
// and comparing with the original string
// @author Developer
// @version 3.0
package com.seveneleven.palindromecheckerapp;
import java.util.Scanner;
public class UseCaseThreePalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println("Input text:"+input);
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse+=input.charAt(i);
		}
		if(input.equals(reverse)) 
			System.out.println("Is it a palindrome? True");
		else 
			System.out.println("Is it a palindrome? False");
	}
}
