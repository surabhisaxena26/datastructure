package org.examples.interviewbit.math;

import java.util.*;

/**
 * Created by surabhi on 23.12.2016.
 */
public class LargestNumber {

        public String largestNumber(final List<Integer> a) {

            // When all the integers are same
            final Set<Integer> uniqueIntegers=new HashSet<Integer>(a);

            if(uniqueIntegers.size()==1){
                if(uniqueIntegers.contains(0)){
                    return "0";
                }else{
                    return toString(a);
                }
            }
            // When atleast two different integers exists
            final List<Integer> sortedList= new ArrayList<Integer>(a);
            Collections.sort(sortedList,new LexicographicalComparator());
            return toString(sortedList);

        }

        private String toString(List<Integer> a){
            final StringBuilder result= new StringBuilder();
            for(Integer p: a){
                result.append(p);
            }
            return result.toString();
        }

        public static void main(String[] args){
            LargestNumber app = new LargestNumber();
            System.out.println(app.largestNumber(Arrays.asList(new Integer[]{3,30,34,5,9,555,0})));
            System.out.println(app.largestNumber(Arrays.asList(new Integer[]{12,121})));
            System.out.println(app.largestNumber(Arrays.asList(new Integer[]{0,0,0})));
        }

}

class LexicographicalComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        String s1= o1.toString();
        String s2= o2.toString();
        Long x= Long.valueOf(s1+s2);
        Long y= Long.valueOf(s2+s1);
        return x>y ? -1 : 1;
    }
}
