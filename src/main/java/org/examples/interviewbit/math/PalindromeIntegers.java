package org.examples.interviewbit.math;

/**
 * problem: https://www.interviewbit.com/problems/palindrome-integer/
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 * A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
 * Negative numbers are not palindromic.
 */
public class PalindromeIntegers {

	public boolean isPalindrome(int a) {

		int i=0;
		int k=a;
		int reverse;
		while (a>0){
			i=i*10+(a%10);
			a/=10;
		}
		//i+=i*10+a;
		//System.out.println(k+ "->"+i);
		return k==i;
	}
	public static void main (String[] args){
		PalindromeIntegers app= new PalindromeIntegers();
		System.out.println(app.isPalindrome(4));
		System.out.println(app.isPalindrome(100));
		System.out.println(app.isPalindrome(121));
	}
}
