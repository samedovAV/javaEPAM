package thirdChapter.thirdChapterC.task6;

import java.util.ArrayList;

public class CircleRaationalFractionRunner {
    /**
     * Определить класс Окружность на плоскости, координаты центра которой
     * задаются с помощью Рациональной Дроби. Определить площадь и периметр.
     * Создать массив/список/множество объектов и определить группы
     * окружностей, центры которых лежат на одной прямой. Определить наибольший
     * и наименьший по площади (периметру) объект.
    */
    public static void main(String[] args) {
        CircleRationalFractionUtils circleRationalFractionUtils = new CircleRationalFractionUtils();

        ArrayList<CircleRationalFraction> circles = circleRationalFractionUtils.createArray();
        circles.forEach(System.out::println);
        circleRationalFractionUtils.findMinArea(circles);
        circleRationalFractionUtils.findMinPer(circles);

        circleRationalFractionUtils.findOnOneLine(circles);
    }
}
