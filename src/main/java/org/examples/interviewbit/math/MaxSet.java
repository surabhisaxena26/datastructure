package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by surabhi on 17.12.2016.
 */
public class MaxSet {

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        //  [1, 2, 5, -7, 2, 3]
        //  [-1, 2, 5, -7, 2, 3]
        int startIndex = -1;
        int endIndex = -1;
        long currentSum = -1;
        int maxStartIndex = -1;
        int maxEndIndex = -1;
        long maxSum = currentSum;
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " Current => " + startIndex + ", " + endIndex + ", " + currentSum);
            System.out.println(a.get(i) + " Max => " + maxStartIndex + ", " + maxEndIndex + ", " + maxSum);
            if (a.get(i) >= 0) {
                if (startIndex == -1) {
                    startIndex = i;
                    endIndex = i;
                    currentSum = Long.valueOf(a.get(i));
                } else {
                    endIndex = i;
                    currentSum += Long.valueOf(a.get(i));
                }
            } else {
                if (i > 0 && a.get(i - 1) >= 0) {
                    if (currentSum > maxSum || (currentSum == maxSum && endIndex - startIndex > maxEndIndex - maxStartIndex)) {
                        maxStartIndex = startIndex;
                        maxEndIndex = endIndex;
                        maxSum = currentSum;
                    }
                }
                startIndex = -1;
                endIndex = -1;
                currentSum = -1;
            }
        }
        if(endIndex>-1 && currentSum > maxSum || (currentSum == maxSum && endIndex - startIndex > maxEndIndex - maxStartIndex)){
            maxStartIndex = startIndex;
            maxEndIndex = endIndex;
            maxSum = currentSum;
        }
        return maxStartIndex>=0 && maxEndIndex>=maxStartIndex ? new ArrayList<Integer>(a.subList(maxStartIndex, maxEndIndex + 1)): new ArrayList<Integer>();
    }


    public static void main(String[] args) {
        MaxSet c = new MaxSet();
        Integer[] array = { 1967513926, 1540383426, -1303455736, -521595368 };
        Stream.of(c.maxset(new ArrayList<Integer>(Arrays.asList(array)))).forEach(x -> System.out.print(x));
        int x= 1967513926;int y= 1540383426;
        System.out.print(x+y);

    }

}
