package thirdChapter.thirdChapterC.task7;

import java.text.DecimalFormat;

public class PointRationalFractionRunner {
    /**
     * Определить класс Точка в пространстве, координаты которой задаются
     * с помощью Рациональной Дроби. Создать методы по определению расстояния
     * между точками и расстояния до начала координат. Проверить для
     * трех точек возможность нахождения на одной прямой.
    */
    public static void main(String[] args) {
        PointRationalFractionUtils pointRationalFractionUtils = new PointRationalFractionUtils();

        PointRationalFraction a = pointRationalFractionUtils.createPoint();
        System.out.println(a.toString());
        PointRationalFraction b = pointRationalFractionUtils.createPoint();
        System.out.println(b.toString());
        PointRationalFraction c = pointRationalFractionUtils.createPoint();
        System.out.println(c.toString());

        System.out.println("Расстояние между точками: " +
                new DecimalFormat("#0.00").format(pointRationalFractionUtils.calculateDistance(a, b)));
        pointRationalFractionUtils.calculateDistanceStart(c);
        pointRationalFractionUtils.checkOneLine(a, b, c);
    }
}