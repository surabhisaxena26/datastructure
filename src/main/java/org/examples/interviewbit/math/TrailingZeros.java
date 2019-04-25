package org.examples.interviewbit.math;

// Given an integer n, return the number of trailing zeroes in n!.

public class TrailingZeros {
    public int trailingZeroes(int a) {
        // Initialize result
        int count = 0;

        // Keep dividing n by powers of 5 and update count
        for (int i=5; a/i>=1; i *= 5)
            count += a/i;

        return count;
    }

    public static void main (String[] args){
        TrailingZeros app = new TrailingZeros();
        System.out.println(app.trailingZeroes(19));
    }
}
