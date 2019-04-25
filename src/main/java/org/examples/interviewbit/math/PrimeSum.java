package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://www.interviewbit.com/problems/prime-sum/
 * Created by surabhi on 29.01.2017.
 * Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.
 * NOTE A solution will always exist. read Goldbach’s conjecture
 */
public class PrimeSum {

	public boolean isPrime(int x, Set<Integer> primeSet){
		if(primeSet.contains(x))
			return true;

		for (int i=2;i*i<=x;i++){
			if(x%i==0)
				return false;
		}
		primeSet.add(x);
		return true;
	}
	public ArrayList<Integer> primeSum(int a){
		final Set<Integer> primeSet = new HashSet<Integer>();
		primeSet.add(2);
		primeSet.add(3);
		for (int i=2;2*i<=a;i++){
				if(isPrime(i, primeSet) && isPrime(a-i,primeSet))
					return new ArrayList<Integer>(Arrays.asList(new Integer[]{i,a-i}));

		}
		return new ArrayList<Integer>();
	}

	public static void main (String[] args){
		PrimeSum app = new PrimeSum();
		System.out.println(app.primeSum(6).stream().map(x -> x.toString()).collect(Collectors.joining(",")));
		System.out.println(app.primeSum(10).stream().map(x -> x.toString()).collect(Collectors.joining(",")));
		System.out.println(app.primeSum(4).stream().map(x -> x.toString()).collect(Collectors.joining(",")));
	}
}
