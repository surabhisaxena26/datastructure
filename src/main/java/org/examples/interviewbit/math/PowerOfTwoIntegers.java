package org.examples.interviewbit.math;

/**
 * Created by surabhi on 26.12.2016.
 */
public class PowerOfTwoIntegers {

    public boolean isPrime(int a){
        for( int j=2;j*j<=a;j++){
            if(a%j==0) {
               return false;
            }
        }
        return a>1;
    }
    public boolean isPower(int a) {
        boolean isPrimeFactorFound=false;
        for (int i=2;i*i<=a;i++){
            boolean isPrime= isPrime(i);
            if(isPrime && a%i==0 && isPrimeFactorFound){
                return false;
            }
            else if(isPrime && a%i==0){
                isPrimeFactorFound=true;
            }
        }
       return a>3 && isPrimeFactorFound== true;
    }

    public static void main (String[] args){
        PowerOfTwoIntegers app = new PowerOfTwoIntegers();
        System.out.println(app.isPower(2));
        System.out.println(app.isPower(7));
        System.out.println(app.isPower(4));
        System.out.println(app.isPower(9));
        System.out.println(app.isPower(6));
    }
}
