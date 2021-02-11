package thirdChapter.thirdChapterB.task9;

import java.util.ArrayList;

public class CircleRunner {
    public static void main(String[] args) {
        ArrayList<Circle> circles;

        CircleUtils circleUtils = new CircleUtils();
        circles = circleUtils.createArray();
        circles.forEach(System.out::println);

        circleUtils.findMinArea(circles);
        circleUtils.findMinPer(circles);

        circleUtils.findOnOneLine(circles);
    }
}
