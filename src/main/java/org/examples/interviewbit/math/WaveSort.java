package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by surabhi on 17.12.2016.
 */
public class WaveSort {

    public void swapElements(ArrayList<Integer> a, int index1, int index2){
        Integer x= a.get(index1);
        a.set(index1,a.get(index2));
        a.set(index2,x);
    }

    public ArrayList<Integer> wave(ArrayList<Integer> a) {
        // sort the array
        ArrayList<Integer> result= new ArrayList<Integer>(a);
        Collections.sort(result);

        for ( int i=1;i<result.size();i+=2){
            swapElements(result,i,i-1);
        }
        return result;
    }

    public static void main (String[] args){
        WaveSort c= new WaveSort();
        Integer[] array = { 4, 1, 3, 2 };
        Stream.of(c.wave(new ArrayList<Integer>(Arrays.asList(array)))).forEach(x -> System.out.print(x));
    }
}
