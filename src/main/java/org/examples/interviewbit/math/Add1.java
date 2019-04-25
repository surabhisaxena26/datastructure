package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by surabhi on 11.12.2016.
 */
public class Add1 {
        public ArrayList<Integer> plusOne(ArrayList<Integer> digits) {
            final int n= digits.size();
            final ArrayList<Integer> y= new ArrayList<Integer>(n+1);
            int sum=digits.get(n-1)+1;
            y.add(sum%10);
            int carry=sum/10;
            int lastNonZeroDigit=-1;
            for (int j=n-2;j>=0;j--){
                sum= carry+ digits.get(j);
                y.add(sum%10);
                carry=sum/10;
                if(sum%10!=0){
                    lastNonZeroDigit=n-2-j;
                }
            }
            if(carry>0) {
                y.add(carry);
                Collections.reverse(y);
                return y;
            }else{
                ArrayList<Integer> p= new ArrayList<Integer>();
                for ( int i=0;i<=lastNonZeroDigit+1;i++){
                    p.add(y.get(i));
                }
                Collections.reverse(p);
                return p;
            }
        }
        public static void printList(List<Integer> y){
            System.out.println("output");
            Stream.of(y).forEach(x -> System.out.print(x));
        }

        public static void main(String[] args){
            Add1 ob = new Add1();
            ArrayList<Integer> digit=new ArrayList<Integer>();
            digit.add(3);
            digit.add(2);
            digit.add(1);

            Add1.printList(ob.plusOne(digit));
            ArrayList<Integer> digit2=new ArrayList<Integer>();
            digit2.add(9);
            digit2.add(9);
            digit2.add(9);

            Add1.printList(ob.plusOne(digit2));
            ArrayList<Integer> digit3=new ArrayList<Integer>();
            digit3.add(0);
            digit3.add(3);
            digit3.add(7);
            digit3.add(4);
            digit3.add(0);digit3.add(5);digit3.add(5);digit3.add(5);

            Add1.printList(ob.plusOne(digit3));

        }


    }

