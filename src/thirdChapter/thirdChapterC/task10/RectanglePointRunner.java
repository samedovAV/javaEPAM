package thirdChapter.thirdChapterC.task10;

import java.util.ArrayList;

public class RectanglePointRunner {
    /**
     * Определить класс Четырехугольник на плоскости, вершины которого
     * имеют тип Точка. Определить площадь и периметр четырехугольника.
     * Создать массив/список/множество объектов и подсчитать количество четырехугольников разного типа
     * (квадрат, прямоугольник, ромб, произвольный). Определить для каждой группы наибольший и наименьший
     * по площади (периметру) объект.
     */
    public static void main(String[] args) {
        RectanglePointUtils rectanglePointUtils = new RectanglePointUtils();
        ArrayList<RectanglePoint> rectanglePoints = rectanglePointUtils.createArray();

        rectanglePointUtils.findTypeAndArea(rectanglePoints);
    }
}
