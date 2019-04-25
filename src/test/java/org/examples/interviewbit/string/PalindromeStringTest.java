package org.examples.interviewbit.string;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by surabhi on 30.01.2017.
 */
public class PalindromeStringTest extends TestCase {

	public void testCase1() {
		Assert.assertTrue(PalindromeStrings.isPalindrome("a"));
		Assert.assertTrue(PalindromeStrings.isPalindrome("abba"));
		Assert.assertTrue(PalindromeStrings.isPalindrome("abcba"));
		Assert.assertTrue(PalindromeStrings.isPalindrome("aA"));
		Assert.assertFalse(PalindromeStrings.isPalindrome("a13A"));
		//Assert.assertTrue(PalindromeStrings.isPalindrome("a13 @A"));
		Assert.assertTrue(PalindromeStrings.isPalindrome("A man, a plan, a canal: Panama"));
		Assert.assertFalse(PalindromeStrings.isPalindrome("Aq man, a plan, a canal: Panama"));
		Assert.assertFalse(PalindromeStrings.isPalindrome("1a2"));

	}
}
