package thirdChapter.thirdChapterB.task9;

import java.util.ArrayList;

public class CircleRunner {
    /**
     * Определить класс Окружность на плоскости. Определить площадь и периметр.
     * Создать массив/список/множество объектов и определить группы
     * окружностей, центры которых лежат на одной прямой. Определить наибольший
     * и наименьший по площади (периметру) объект.
    */
    public static void main(String[] args) {
        CircleUtils circleUtils = new CircleUtils();
        ArrayList<Circle> circles = circleUtils.createArray();
        circles.forEach(System.out::println);

        circleUtils.findMinArea(circles);
        circleUtils.findMinPer(circles);

        circleUtils.findOnOneLine(circles);
    }
}
