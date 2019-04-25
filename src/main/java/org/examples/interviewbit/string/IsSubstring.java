package org.examples.interviewbit.string;

/**
 * Created by surabhi on 03.02.2017.
 */
public class IsSubstring {

	public static int isSubstring(String haystack, String needle){

		char[] a = haystack.toCharArray();
		if(needle.isEmpty())
			return -1;
		char x= needle.charAt(0);
		int j=0;
		int lastPos=haystack.length()-needle.length();
		while(j<= lastPos){
			while(j<=lastPos && a[j]!=x)
				j++;
			if(j>lastPos)
				break;
			int temppos=j;
			boolean result=true;
			for(int i=1;i<needle.length();i++)
			{
				if(temppos== j && a[j+i]==x)
					temppos=j+i;
				if(a[j+i]!=needle.charAt(i))
				{
					result=false;
					if(temppos!=j)
						j=temppos;
					else
						j=j+i+1;
					break;
				}
			}
			if(result)
				return j;
		}
		return -1;
	}
}
