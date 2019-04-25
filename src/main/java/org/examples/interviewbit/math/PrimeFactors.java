package org.examples.interviewbit.math;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by surabhi on 28.01.2017.
 */
public class PrimeFactors {

	public void incrementResult(Map<Integer,Integer>primeFactors, Integer p){
		if(!primeFactors.containsKey(p))
			primeFactors.put(p,0);
		Integer y= primeFactors.get(p);
		primeFactors.put(p,y+1);
	}

	public boolean isPrime(int n, Set<Integer> primeSet){
		if (primeSet.contains(n))
			return true;
		boolean isPrime=true;
		for (int i=2; i*i<=n;i++){
			if(n%i==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime)
			primeSet.add(n);
		return isPrime;
	}
	public boolean isPowerOf2Integers(int a){
		// Each number n can be expressed as p1^a1 . p2^a2 ......
		// In this case, we need to check if the number can be expressed as product of primes but all primes having same power indices
		// If so, n can be expressed as (p1.p2)^a1 given that a1=a2
		// Map containing prime factor and their power indices
		final Map<Integer, Integer> primeFactors= new HashMap<Integer,Integer>();
		Set<Integer> primeSet = new HashSet<Integer>();
		int k=a;
		while(k>1){
			//System.out.println("k is defined as "+k);
			boolean factorFound=false;
			for(int i=2;i*i<=k;i++){
				// we only need to find prime factors, skip other ones
				// Apply memoization to optimally test for primes
				if(!isPrime(i,primeSet))
					continue;
				//System.out.println("i is defined as "+i);
				if (k%i ==0){
					//System.out.println(k +" is divisible by "+i);
					incrementResult(primeFactors,i);
					k=k/i;
					factorFound=true;
					break;
				}
			}
			if(!factorFound){
				//System.out.println(k +" is prime ");
				incrementResult(primeFactors,k);
				k=1;
				break;
			}
		}
		System.out.println(primeFactors);
		return primeFactors.entrySet().stream().map(Map.Entry::getValue).allMatch(y -> y>1) && primeFactors.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toSet()).size()==1;

	}

	public static void main (String[] args){
		PrimeFactors app = new PrimeFactors();
		System.out.println(app.isPowerOf2Integers(1024000000));
		System.out.println(app.isPowerOf2Integers(536870912));
		System.out.println(app.isPowerOf2Integers(15));
		System.out.println(app.isPowerOf2Integers(27));

	}
}
