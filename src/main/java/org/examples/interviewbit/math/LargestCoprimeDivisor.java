package org.examples.interviewbit.math;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given two positive numbers A and B. You need to find the maximum valued integer X such that:
 *X divides A i.e. A % X = 0
 *X and B are co-prime i.e. gcd(X, B) = 1
 *For example,
 *A = 30
 *B = 12
 *We return
 *X = 5
 */
public class LargestCoprimeDivisor {

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

	public int coprimeDivisor2(int k, int b) {
		int a = k;
		if (b == 1)
			return 1;
		else {
			final Set<Integer> primeSet = new HashSet<Integer>();
			for (int i = 2; i * i <= b; i++) {
				//System.out.println ("i ="+ i +"b ="+ b+ "a ="+ a);
				if (isPrime(i, primeSet) && b % i == 0 && a % i == 0) {
					do {
						//System.out.println ("Changing a "+ a + " to " + a/i);
						a = a / i;
					} while (a % i == 0);
				}
			}
			if (a % b == 0) {
				do {
					a /= b;
				} while (a % b == 0);
			}
		}
		return a;
	}

	public static void main(String[] args){
		LargestCoprimeDivisor app = new LargestCoprimeDivisor();

		System.out.println(app.coprimeDivisor2(30,12));
		System.out.println(app.coprimeDivisor2(30,24));
		System.out.println(app.coprimeDivisor2(24,30));
		System.out.println(app.coprimeDivisor2(1,12));
		System.out.println(app.coprimeDivisor2(12,12));
		System.out.println(app.coprimeDivisor2(39,13));
		System.out.println(app.coprimeDivisor2(4,2));

	}
}
