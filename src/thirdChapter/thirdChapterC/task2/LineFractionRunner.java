package thirdChapter.thirdChapterC.task2;

import java.util.ArrayList;

public class LineFractionRunner {
    /**
     * Определить класс Прямая на плоскости (в пространстве), параметры которой
     * задаются с помощью Рациональной Дроби. Определить точки пересечения прямой
     * с осями координат. Определить координаты пересечения
     * двух прямых. Создать массив/список/множество объектов и определить
     * группы параллельных прямых.
    */
    public static void main(String[] args) {
        LineFractionUtils lineFractionUtils = new LineFractionUtils();
        ArrayList<LineFraction> lineFractions = lineFractionUtils.createArray();

        lineFractionUtils.findInsertionPoints(lineFractions);
        lineFractionUtils.findParallelLines(lineFractions);
    }
}
