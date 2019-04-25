package org.examples.interviewbit.math;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by surabhi on 24.12.2016.
 */
public class FindDuplicate {

    public int repeatedNumber(final List<Integer> a) {
        Set<Integer> currentSet= new HashSet<Integer>(a.size());
        for(Integer p: a){
            if(currentSet.contains(p))
                return p;
            currentSet.add(p);
        }
        return -1;
    }
}
