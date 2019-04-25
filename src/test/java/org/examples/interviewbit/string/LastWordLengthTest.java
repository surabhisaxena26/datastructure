package org.examples.interviewbit.string;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by surabhi on 30.01.2017.
 */
public class LastWordLengthTest extends TestCase {
	public void testGetLastWordLength() throws Exception {
		System.out.println(LastWordLength.getLastWordLength("a"));
		Assert.assertEquals(LastWordLength.getLastWordLength("a"),1);
		Assert.assertEquals(LastWordLength.getLastWordLength(""),0);
		Assert.assertEquals(LastWordLength.getLastWordLength(" "),0);
		Assert.assertEquals(LastWordLength.getLastWordLength("a  "),1);
		Assert.assertEquals(LastWordLength.getLastWordLength("  a"),1);
		Assert.assertEquals(LastWordLength.getLastWordLength("abc xyzd"),4);
		Assert.assertEquals(LastWordLength.getLastWordLength("abc xyzd "),4);
		Assert.assertEquals(LastWordLength.getLastWordLength("Hello World"),5);
	}

}
