package org.examples.interviewbit.string;

/**
 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 Example:

 "A man, a plan, a canal: Panama" is a palindrome.

 "race a car" is not a palindrome.

 Return 0 / 1 ( 0 for false, 1 for true ) for this problem
 */
public class PalindromeStrings {


	public static boolean isPalindrome(String s){
		// convert everything to lowercase + remove all not required characters
		final String p=s.toLowerCase().chars().filter(x -> Character.isLetter(x) || Character.isDigit(x))
				.collect(StringBuilder::new, (sb, c) -> sb.append((char)c), StringBuilder::append).toString();
		if(p.isEmpty())
			return true;
		char[] x= p.toCharArray();
		int i=0;
		while(i<x.length/2){
			if(x[i]!=x[x.length-1-i])
				return false;
			i++;
		}
		return true;
	}


}

