package thirdChapter.thirdChapterB.task10;

import java.util.ArrayList;

public class LineRunner {
    /**
     * Определить класс Прямая на плоскости (пространстве). Определить точки
     * пересечения прямой с осями координат. Определить координаты пересечения двух прямых.
     * Создать массив/список/множество объектов и определить группы параллельных прямых.
    */
    public static void main(String[] args) {
        LineUtils lineUtils = new LineUtils();

        ArrayList<Line> lines = lineUtils.createArray();

        lineUtils.findInsertionPoints(lines);
        lineUtils.findParallelLines(lines);
    }
}
