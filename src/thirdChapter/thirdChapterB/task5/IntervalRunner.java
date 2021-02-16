package thirdChapter.thirdChapterB.task5;

import java.util.ArrayList;

public class IntervalRunner {
    /**
     * Определить класс Интервал с учетом включения/невключения концов.
     * Создать методы по определению пересечения и объединения интервалов,
     * причем интервалы, не имеющие общих точек, пересекаться/объединятся не
     * могут. Объявить массив/список/множество и n интервалов и определить
     * расстояние между самыми удаленными концами.
    */
    public static void main(String[] args) {
        ArrayList<Interval> intervals;

        IntervalUtils intervalUtils = new IntervalUtils();
        intervals = intervalUtils.createIntervals();
        intervals.forEach(System.out::println);

        System.out.println(intervalUtils.findDistance(intervals));
    }
}
