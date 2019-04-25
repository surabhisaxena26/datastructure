package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by surabhi on 25.12.2016.
 */
public class FindFactors {

    public ArrayList<Integer> allFactors(int a) {
        final ArrayList<Integer> result= new ArrayList<Integer>();
        final ArrayList<Integer> nextResult= new ArrayList<Integer>();


        for(int i=1; i*i<=a;i++){
            if(a%i == 0){
                result.add(i);
                if(i!= a/i) {
                    nextResult.add(a / i);
                }
            }
        }
        Collections.reverse(nextResult);
        result.addAll(nextResult);
        return result;
    }

    public static void main (String [] args){
        FindFactors app = new FindFactors();
        List<Integer> x= app.allFactors(7);
        System.out.println(Stream.of(x).map(i-> i.toString()).collect(Collectors.joining(" , ")));
    }

}
