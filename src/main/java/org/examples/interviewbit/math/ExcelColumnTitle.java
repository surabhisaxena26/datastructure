package org.examples.interviewbit.math;

/**
 * Created by surabhi on 26.12.2016.
 */
public class ExcelColumnTitle {

    public String convertToTitle(int a) {
        final StringBuilder sb= new StringBuilder();
        while(a>26){
            char toAppend;
            if (a%26==0){
                toAppend='Z';
                a=a/26-1;
            }else
            {
                toAppend=(char)((a%26)+64);
                a/=26;
            }
            sb.append(toAppend);
        }
        sb.append((char)((a+64)));
        return sb.reverse().toString();
    }

    public static void main(String[] args){
        ExcelColumnTitle app = new ExcelColumnTitle();
        System.out.println(app.convertToTitle(26));
        System.out.println(app.convertToTitle(52));
        System.out.println(app.convertToTitle(1));
        System.out.println(app.convertToTitle(28));
        System.out.println(app.convertToTitle(27));
    }
}
