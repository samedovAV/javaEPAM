package thirdChapter.thirdChapterB.task5;

import java.util.ArrayList;

public class IntervalRunner {
    public static void main(String[] args) {
        ArrayList<Interval> intervals;

        IntervalUtils intervalUtils = new IntervalUtils();
        intervals = intervalUtils.createIntervals();
        intervals.forEach(System.out::println);

        System.out.println(intervalUtils.findDistance(intervals));
    }
}
