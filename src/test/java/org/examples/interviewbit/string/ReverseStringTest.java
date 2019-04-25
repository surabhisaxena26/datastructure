package org.examples.interviewbit.string;

import junit.framework.TestCase;

/**
 * Created by surabhi on 03.02.2017.
 */
public class ReverseStringTest extends TestCase {
	public void testReverseString() throws Exception {
		assertEquals("abc",ReverseString.reverseString("abc"));
		assertEquals("",ReverseString.reverseString(""));
		assertEquals("xxx",ReverseString.reverseString("xxx "));
		assertEquals("xxx",ReverseString.reverseString(" xxx "));
		assertEquals("x x x",ReverseString.reverseString(" x x x "));
		assertEquals("x c b a x",ReverseString.reverseString(" x a    b  c x "));
		assertEquals("x",ReverseString.reverseString("x"));
		assertEquals("blue is sky the",ReverseString.reverseString("the sky is blue"));
		assertEquals("blue is sky t",ReverseString.reverseString("t sky is blue"));
		assertEquals("blue is sky t",ReverseString.reverseString(" t sky is  blue "));
	}

}
