package org.examples.interviewbit.math;

/**
 * Created by surabhi on 26.12.2016.
 */
public class ExcelColumnNumber {

    public int titleToNumber(String a) {
        char[] arr=a.toUpperCase().toCharArray();
        final int length= arr.length;
        int col=0;
        for(int i=length-1;i>-1;i--){
            col+=((int)arr[i]-64)* Math.pow(26,length-1-i);
        }
        return col;
    }
    public static void main (String args[]){
        ExcelColumnNumber app = new ExcelColumnNumber();
        System.out.println(app.titleToNumber("A"));
        System.out.println(app.titleToNumber("AB"));
        System.out.println(app.titleToNumber("Z"));
        System.out.println(app.titleToNumber("AA"));
    }
}
