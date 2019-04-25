package org.examples.interviewbit.math;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Created by surabhi on 29.01.2017.
 */
public class PettyPrint {

	public static void printArray(ArrayList<ArrayList<Integer>> x, int n){
		for (int i=0;i<n;i ++){
			for(int j=0;j<n;j ++){
				System.out.print(x.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> convertToArrayList(int[][] a , int n){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i=0;i<n;i++){
			ArrayList<Integer> x = new ArrayList<Integer>(n);
			for (int j=0;j<n;j++){
				x.add(a[i][j]);
			}
			result.add(x);
		}
		return result;
	}

	public ArrayList<ArrayList<Integer>> pettyPrint(int n){
		int size= 2*n-1;
		int[][] a = new int[2*n-1][2*n-1];
		int top =0, left =0 ;
		int bottom =2*n-2, right =2*n-2 ;
		do{
			for (int i= left;i<=right; i++){
				a[top][i]=n;
				a[bottom][i]=n;
			}

			for (int i= top;i<=bottom; i++){
				a[i][left]=n;
				a[i][right]=n;
			}
			top++;left++;
			right--;bottom--;
			n--;
		}while(n>0);
		return convertToArrayList(a,size);
	}
	public static void main (String[] args){
		PettyPrint app = new PettyPrint();
		ArrayList<ArrayList<Integer>> result =app.pettyPrint(3);
		result.stream().forEach(x -> System.out.println(x.stream().map(y -> y.toString()).collect(Collectors.joining(" "))));
		//printArray(result,2*3-1);

	}
}
