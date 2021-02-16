package thirdChapter.thirdChapterB.task7;

import java.util.ArrayList;

public class TriangleRunner {
    /**
     * Определить класс Треугольник на плоскости. Определить площадь и периметр треугольника.
     * Создать массив/список/множество объектов и подсчитать количество треугольников
     * разного типа (равносторонний, равнобедренный, прямоугольный, произвольный).
     * Определить для каждой группы наибольший и наименьший по площади (периметру) объект.
    */
    public static void main(String[] args) {
        ArrayList<Triangle> triangles;

        TriangleUtils triangleUtils = new TriangleUtils();
        triangles = triangleUtils.createArray();

        triangleUtils.findTypeAndArea(triangles);
    }
}
