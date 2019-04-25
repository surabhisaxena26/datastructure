package org.examples.interviewbit.math;

/**
 * Problem : https://www.interviewbit.com/problems/grid-unique-paths/
 * A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).
 * How many possible unique paths are there?
 * Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.
 */
public class UniquePath {

	public Long computeFactorial(Long x){
		if(x<2)
			return 1L;
		return Long.valueOf(x)* computeFactorial(x-1);
	}
	public int countUniquePaths(int a, int b){
		// base condition -> 1x1 grid
		if(a==b && a==1)
			return 1;
		if(a==1 || b==1)
			return 1;
		int smallerVal = a>b ? b: a;
		int largerVal = a+b-smallerVal;
		Long i=1L;
		for(int k=largerVal; k<=(smallerVal+largerVal-2);k++){
			i=i*k;
		}
		long smallerVal1=smallerVal-1;
		return Integer.parseInt(Long.valueOf(i/computeFactorial(smallerVal1)).toString());
	}

	public static void main(String[] args){
		UniquePath app = new UniquePath();
		//System.out.println(app.computeFactorial(99L));
		//System.out.println(app.computeFactorial(5L));
		//System.out.println(app.computeFactorial(1L));
		//System.out.println(app.computeFactorial(0L));
		//System.out.println(app.countUniquePaths(100,1));
		//System.out.println(app.countUniquePaths(2,2));
		//System.out.println(app.countUniquePaths(3,4));
		System.out.println(app.countUniquePaths(15,9));

	}
}
