package org.algo.standard;

/**
 * Created by surabhi on 29.01.2017.
 */
public class InsertionSort {
	// {1,5,6,3,1};
	public static void sort(int[] a){
		if(a.length<2)
			return;
		for (int i=1;i<a.length;i++) {
			int j = i-1;
			int x= a[i];
			while (j >= 0 && a[j] > x) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = x;
		}
	}
}
