package org.examples.interviewbit.string;

/**
 * https://www.interviewbit.com/problems/length-of-last-word/
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 If the last word does not exist, return 0.
 Note: A word is defined as a character sequence consists of non-space characters only.
 */
public class LastWordLength {

	public static int getLastWordLength(String s){
		char[] x = s.toCharArray();
		int k=x.length-1;
		if(k<0)
			return 0;
		// remove trailing spaces
		while(k>-1 && !Character.isLetter(x[k])){
			k--;
		}
		if(k<0)
			return 0;
		int j=k;
		while(k>-1 && Character.isLetter(x[k])){
			k--;
		}
		return k<0 ? j+1: j-k;
	}
}
