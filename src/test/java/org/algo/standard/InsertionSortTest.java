package org.algo.standard;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by surabhi on 29.01.2017.
 */
public class InsertionSortTest extends TestCase{

	public void testCase1() {
		int[] a  = {1,5,6,3,1};
		int[] sorted  = {1,1,3,5,6};
		InsertionSort.sort(a);
		Arrays.stream(a).forEach(x-> System.out.print(x));
		Assert.assertTrue(Arrays.equals(a,sorted));
	}


}
