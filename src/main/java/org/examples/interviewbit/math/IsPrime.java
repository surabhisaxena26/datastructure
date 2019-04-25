package org.examples.interviewbit.math;

/**
 * Created by surabhi on 25.12.2016.
 */
public class IsPrime {

    public int isPrime(int a) {
        for(int i=2; i*i<=a;i++){
            if(a%i==0)
                return 0;
        }
        return 1;
    }

    public static void main( String[] args){
        IsPrime app = new IsPrime();
        System.out.println(app.isPrime(4));
    }
}
