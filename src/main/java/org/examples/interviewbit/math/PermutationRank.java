package org.examples.interviewbit.math;

import java.util.*;

/**
 * Created by surabhi on 27.12.2016.
 */
public class PermutationRank {


    public Long factorial(int n, Map<Integer,Long> factorialMap ){
        if(!factorialMap.containsKey(n)) {
            //System.out.println(n);
            //System.out.println(factorialMap.get(n-1));
            factorialMap.put(n, n*factorial(n - 1, factorialMap));
        }
        return factorialMap.get(n);
    }

    public Long findRank(String a) {
        HashMap<Integer, Long> factorialMap= new HashMap<Integer,Long>(a.length());
        factorialMap.put(1,1L);
        factorialMap.put(0,1L);
        char[] arr=a.toCharArray();
        TreeSet<Character> rankArr= new TreeSet<Character>();
        for(char j: arr){
            rankArr.add(j);
        }
        Long result=0L;
        for(int i=0;i<arr.length;i++){
            //System.out.println("rank of "+arr[i] +" = "+rankArr.headSet(arr[i],false).size());
            //System.out.println("factorial "+(arr.length-1-i)+ " = "+factorial(arr.length-1-i,factorialMap));
            result+=rankArr.headSet(arr[i],false).size()*factorial(arr.length-1-i,factorialMap);
            rankArr.remove(arr[i]);
        }
        Long j=(result+1)%1000003;
        int x=Integer.parseInt(j.toString());

        return result+1;

    }

    public static void main(String[] args){
        PermutationRank app = new PermutationRank();
        System.out.println(app.findRank("abc"));
        System.out.println(app.findRank("acb"));
        System.out.println(app.findRank("bac"));
        System.out.println(app.findRank("bca"));
        System.out.println(app.findRank("cab"));
        System.out.println(app.findRank("cba"));
    }
}
