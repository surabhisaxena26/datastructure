package org.examples.interviewbit.string;

/**
 * https://www.interviewbit.com/problems/reverse-the-string/
 * Given an input string, reverse the string word by word.
 */
public class ReverseString {

	public static String reverseString(String a){
		char[] p=a.toCharArray();
		StringBuilder sb= new StringBuilder();
		int j= p.length-1;
		while(j>-1 && p[j]==32)
			j--;
		int lastAlphaPos=j;
		while(j>-1){
			while(j>-1 && p[j]==32)
				j--;
			if(j<0)
				break;
			int k=j;
			while(k>-1 && p[k]!=32 )
				k--;
			if(j!=lastAlphaPos)
				sb.append((char)32);
			int n = k>-1?k+1: 0;
			sb.append(p,n,j-n+1);
			j=k;
		}
		return sb.toString();
	}

	public static void main(String[] args){
		ReverseString app = new ReverseString();
		System.out.println(app.reverseString("the sky is blue"));
		System.out.println(app.reverseString("t sky is blue"));
		System.out.println(app.reverseString(" t sky is  blue "));
	}
}
