package org.examples.interviewbit.string;

import junit.framework.TestCase;

/**
 * Created by surabhi on 03.02.2017.
 */
public class IsSubstringTest extends TestCase {

	public void testSubstring() throws Exception {
		assertEquals(-1,IsSubstring.isSubstring("",""));
		assertEquals(-1,IsSubstring.isSubstring("x",""));
		assertEquals(-1,IsSubstring.isSubstring("","x"));
		assertEquals(1,IsSubstring.isSubstring("abc","b"));
		assertEquals(1,IsSubstring.isSubstring("bbbacd","bbac"));
		assertEquals(0,IsSubstring.isSubstring("b","b"));
		assertEquals(1,IsSubstring.isSubstring(" b ","b"));
		assertEquals(1,IsSubstring.isSubstring("bbbac","bbac"));
		assertEquals(0,IsSubstring.isSubstring("bbacb","bbac"));
		assertEquals(-1,IsSubstring.isSubstring("bbbac","bbacx"));
		assertEquals(13,IsSubstring.isSubstring("aabaaaababaabbbabbabbbaabababaaaaaababaaabbabbabbabbaaaabbbbbbaabbabbbbbabababbaaabbaabbbababbb","bba"));


	}

}
