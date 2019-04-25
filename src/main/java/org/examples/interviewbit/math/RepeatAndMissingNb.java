package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by surabhi on 24.12.2016.
 */
public class RepeatAndMissingNb {

    public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        Long sum=0L;
        Long sumOfSquares=0L;
        for(Integer x: a) {
            sum += Long.valueOf(x);
            sumOfSquares += Long.valueOf(x) * Long.valueOf(x);
        }
        Long size= Long.valueOf(a.size());
        Long expectedSum=(size*(size+1))/2;
        Long expectedSumOfSquares= (size*(size+1)* (2*size+1))/6;
        Long diff= sum-expectedSum;
        Long squaresDiff= sumOfSquares-expectedSumOfSquares;
        Long sum1= squaresDiff/diff;
        Integer repeatedNumber = Integer.parseInt(Long.toString((sum1+diff)/2));
        Integer missingNumber = Integer.parseInt(Long.toString(sum1-repeatedNumber));
        return new ArrayList<Integer>(Arrays.asList(new Integer[]{repeatedNumber,missingNumber}));
    }

    public static void main(String args[]){
        RepeatAndMissingNb app = new RepeatAndMissingNb();
        System.out.println(Stream.of(app.repeatedNumber(Arrays.asList(new Integer[]{3,1,2,5,3}))).map(i-> i.toString()).collect(Collectors.joining(", ")));
    }
}
