package org.examples.interviewbit.math;

import java.util.ArrayList;

/**
 * Created by surabhi on 17.12.2016.
 */
public class MergeIntervals {

    // [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].
    // [1,3],[6,9] insert and merge [4,5] would result in [1,3],[4,5],[6,9].
    // [1,3],[6,9] insert and merge [4,8] would result in [1,3],[4,9].

    public static boolean isInsideInterval(Interval parentInterval, int value){
        return value >= parentInterval.start && value<= parentInterval.end;
    }

    public static ArrayList<Interval> dropItemsBetween(ArrayList<Interval> k,int start, int end){
        ArrayList<Interval> result = new ArrayList<Interval>();
            for (int i = 0; i < k.size(); i++) {
                if( i<start || i> end) {
                    result.add(k.get(i));
                }
            }
            return result;
    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int mergeStart=-1;
        int mergeEnd=-1;
        for (int i = 0; i < intervals.size(); i++) {
            if (newInterval.start >= intervals.get(i).start) {
                mergeStart=i;
            }
            if (newInterval.end >= intervals.get(i).start) {
               mergeEnd=i;
            }
        }
        ArrayList<Interval> result = dropItemsBetween(intervals, mergeStart + (mergeStart >-1 && isInsideInterval(intervals.get(mergeStart),newInterval.start)?0:1), mergeEnd);
 //       result.add(mergeStart + (mergeStart >-1 && isInsideInterval(intervals.get(mergeStart),newInterval.start)?0:1, new Interval());

        return result;


}
}
class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
  }
