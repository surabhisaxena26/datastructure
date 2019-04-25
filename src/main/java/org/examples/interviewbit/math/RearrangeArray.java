package org.examples.interviewbit.math;

/**
 * Created by surabhi on 27.12.2016.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

 Example:

 Input : [1, 0]
 Return : [0, 1]

 https://www.interviewbit.com/problems/rearrange-array/

 */
public class RearrangeArray {

    // Bsurabhically, we need a way to store new & old value for each index
    // Let say, the old value of i'th index is x & new value is x'
    // Let f(x,x',n)= y = x*n + x' where N is size of array
    // x' = y%N & x = y/N

    public void arrange(ArrayList<Integer> a) {
        final int n = a.size();
        for (int i=0;i<n;i++){
            int newVal = a.get(i)<i ? a.get(a.get(i))/n : a.get(a.get(i));
            a.set(i, a.get(i)*n + newVal);
        }
        for (int i=0;i<n;i++){
            a.set(i, a.get(i)%n);
        }
    }

    public static void main (String[] args){

        RearrangeArray app = new RearrangeArray();
        ArrayList<Integer> a =  new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 0, 2, 1, 3 } ));
        app.arrange(a);
        System.out.println(a.stream().map(x-> x.toString()).collect(Collectors.joining(",")));
        a =  new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4,0} ));
        app.arrange(a);
        System.out.println(a.stream().map(x-> x.toString()).collect(Collectors.joining(",")));

    }
}

