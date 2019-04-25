package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by surabhi on 24.12.2016.
 */
public class SetMatrixZero {

    public void setZeroes(ArrayList<ArrayList<Integer>> a) {

        for(int i=0;i<a.size();i++){
            for(int j=0; j<a.get(0).size(); j++){
                // -1 depicts if the column has to be set 0
                // -2 depicts if the row has to be set 0
                // -3 for both
                if(a.get(i).get(j)==0){
                    // row check
                    if(a.get(i).get(0)==-1){
                        a.get(i).set(0,-3);
                    }else if (a.get(i).get(0)!=-3){
                        a.get(i).set(0,-2);
                    }
                    // column check
                    if(a.get(0).get(j)==-2) {
                        a.get(0).set(j, -3);
                    }else if (a.get(0).get(j)!=-3){
                        a.get(0).set(j, -1);
                    }
                }
            }
        }
        printArray(a);
        for(int i=0;i<a.size();i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                if (a.get(i).get(j) == 1) {
                    if (a.get(0).get(j) == -3 || a.get(0).get(j) == -1 || a.get(i).get(0) == -2 || a.get(i).get(0) == -3) {
                        a.get(i).set(j, 0);
                    }
                }
            }
        }
        printArray(a);
        for(int i=0;i<a.size();i++){
            for(int j=0; j<a.get(0).size(); j++){
                if(a.get(i).get(j)<0){
                    a.get(i).set(j,0);
                }
            }
        }
        printArray(a);
    }

    public static void printArray(ArrayList<ArrayList<Integer>>x){
        for(int i=0;i<x.size();i++){
            for(int j=0; j<x.get(0).size(); j++){
                System.out.print(x.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        ArrayList<ArrayList<Integer>> x= new ArrayList<ArrayList<Integer>>();
        x.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{1,0})));
        x.add( new ArrayList<Integer>(Arrays.asList(new Integer[]{1,1})));
        //x.add( new ArrayList<Integer>(Arrays.asList(new Integer[]{1,1,1})));
        SetMatrixZero app = new SetMatrixZero();
        app.setZeroes(x);
        printArray(x);
    }
}
