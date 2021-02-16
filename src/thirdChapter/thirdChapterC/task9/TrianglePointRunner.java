package thirdChapter.thirdChapterC.task9;

import java.util.ArrayList;

public class TrianglePointRunner {
    /**
     * Определить класс Треугольник на плоскости, вершины которого имеют
     * тип Точка. Определить площадь и периметр треугольника. Создать массив/список/множество
     * объектов и подсчитать количество треугольников разного типа
     * (равносторонний, равнобедренный, прямоугольный, произвольный).
     * Определить для каждой группы наибольший и наименьший по площади (периметру) объект.
    */
    public static void main(String[] args) {
        ArrayList<TrianglePoint> triangles;

        TrianglePointUtils triangleUtils = new TrianglePointUtils();
        triangles = triangleUtils.createArray();

        triangleUtils.findTypeAndArea(triangles);
    }
}
