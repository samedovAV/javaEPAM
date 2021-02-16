package thirdChapter.thirdChapterB.task8;

import java.util.ArrayList;

public class QuadRangleRunner {
    /**
     * Определить класс Четырехугольник на плоскости. Определить площадь
     * и периметр четырехугольника. Создать массив/список/множество объектов
     * и подсчитать количество четырехугольников разного типа (квадрат,прямоугольник, ромб, произвольный).
     * Определить для каждой группы наибольший и наименьший по площади (периметру) объект.
    */
    public static void main(String[] args) {
        ArrayList<QuadRangle> quadRangles;

        QuadRangleUtils quadRangleUtils = new QuadRangleUtils();
        quadRangles = quadRangleUtils.createArray();

        quadRangleUtils.findTypeAndArea(quadRangles);
    }
}
