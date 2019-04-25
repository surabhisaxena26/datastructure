package org.examples.interviewbit.math;

/**
 * Created by surabhi on 27.12.2016.
 */
public class GCD {

    public int gcd(int a, int b) {

        int smallest= a>b? b: a;
        int largest=a+b-smallest;
        if(smallest==0)
            return  largest;
        if(smallest==largest)
            return smallest;
        int gcd=1;
        for(int i=1;i*i<=smallest;i++){
            if(smallest%i==0 && largest%i==0 && i>gcd)
                gcd=i;
            if(smallest%i==0 && largest%(smallest/i)==0 && (smallest/i)>gcd)
                gcd=smallest/i;
        }
        return gcd;
    }
    public static void main (String[] args){
        GCD app= new GCD();
        System.out.println(app.gcd(25,0));
        System.out.println(app.gcd(25,1));
        System.out.println(app.gcd(6,9));
        System.out.println(app.gcd(7,2));
        System.out.println(app.gcd(7,19));
        System.out.println(app.gcd(18,72));
        System.out.println(app.gcd(42,196));
    }
}
