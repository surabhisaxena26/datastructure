package org.examples.interviewbit.math;

/**
 * Created by surabhi on 30.12.2016.
 */
public class AllPermutations {

    public void swap(char[] word, int src, int dest){
        char t= word[src];
        word[src]=word[dest];
        word[dest]=t;

    }
    public void permute(char[] word, int left, int right) {
        if (left == right) {
            System.out.println(word);
            return;
        }
        for (int i = left; i <= right; i++){
            swap(word, left, left + i);
            permute(word, left + 1, right);
            swap(word, left, left + i );
        }// backtrack
    }

    public void allPermutations(final String str){
        char[] word = str.toCharArray();
        permute(word,0,word.length-1);

    }

    public static void main (String args[]){
        AllPermutations app= new AllPermutations();
        app.allPermutations("ab");
    }
}
