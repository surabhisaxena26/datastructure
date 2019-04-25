package org.examples.interviewbit.math;

/**
 * Created by surabhi on 29.01.2017.
 */
public class ReverseInteger {

	public int reverse(int p) {

		long i=0;
		int a= Math.abs(p);
		while (a>0){

			long newVal=i*10+(a%10);
			//System.out.println("i = "+i+ " newVal= "+ newVal );
			// If the overflow happens
			if(newVal>Integer.MAX_VALUE)
				return 0;
			i=newVal;
			a/=10;
		}
		return Long.valueOf(i * (p>0 ? 1: -1)).intValue();
	}
	public static void main(String[] args){
		ReverseInteger app = new ReverseInteger();
		System.out.println(app.reverse(1000));
		System.out.println(app.reverse(121));
		System.out.println(app.reverse(-1146467285));
	}
}
