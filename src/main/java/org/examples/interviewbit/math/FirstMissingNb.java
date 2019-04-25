package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by surabhi on 24.12.2016.
 */
public class FirstMissingNb {
    public int firstMissingPositive(ArrayList<Integer> a) {
        Integer result=1;
        final ArrayList<Integer> positiveInts= new ArrayList<Integer>(a.size());
        for(Integer x: a){
            if(x>0)
                positiveInts.add(x);
        }
        if(positiveInts.isEmpty())
            return 1;
        int size=positiveInts.size();
        for(int i = 0; i < positiveInts.size(); i++)
        {
            if(Math.abs(positiveInts.get(i- 1)) < size && positiveInts.get(Math.abs(positiveInts.get(i - 1))) > 0)
                positiveInts.set(Math.abs(positiveInts.get(i - 1)),-1* positiveInts.get(Math.abs(positiveInts.get(i - 1))));
        }
        // Return the first index value at which is positive
        for(int i = 0; i < size; i++)
            if (positiveInts.get(i) > 0)
                return i+1;  // 1 is added becuase indexes start from 0
        return size+1;
    }

    public static void main(String args[]){
        FirstMissingNb app = new FirstMissingNb();
        System.out.println(app.firstMissingPositive(new ArrayList<Integer>(Arrays.asList(new Integer[]{3,1,2,5}))));
    }
}
