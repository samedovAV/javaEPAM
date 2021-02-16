package thirdChapter.thirdChapterC.task7;

import thirdChapter.thirdChapterB.task1.RationalFraction;
import thirdChapter.thirdChapterB.task1.RationalFractionUtils;

import java.text.DecimalFormat;

public class PointRationalFractionUtils {

    public PointRationalFraction createPoint() {
        RationalFraction x = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction y = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction z = new RationalFraction((int)(1+Math.random()*11), 9);

        return new PointRationalFraction(x, y, z);
    }

    public double calculateDistance(PointRationalFraction a, PointRationalFraction b) {
        RationalFractionUtils rationalFractionUtils = new RationalFractionUtils();

        RationalFraction first = rationalFractionUtils.sub(b.getX(), a.getX());
        RationalFraction second = rationalFractionUtils.sub(b.getY(), a.getY());
        RationalFraction third = rationalFractionUtils.sub(b.getZ(), a.getZ());

        first = rationalFractionUtils.pow(first, 2);
        second = rationalFractionUtils.pow(second, 2);
        third = rationalFractionUtils.pow(third, 2);

        RationalFraction res = rationalFractionUtils.add(rationalFractionUtils.add(first, second), third);

        return findSqrt(res);
    }

    public void calculateDistanceStart(PointRationalFraction a) {
        RationalFractionUtils rationalFractionUtils = new RationalFractionUtils();

        RationalFraction first = rationalFractionUtils.pow(a.getX(), 2);
        RationalFraction second = rationalFractionUtils.pow(a.getY(), 2);
        RationalFraction third = rationalFractionUtils.pow(a.getZ(), 2);

        RationalFraction res = rationalFractionUtils.add(rationalFractionUtils.add(first, second), third);

        double dist = findSqrt(res);
        System.out.println("Расстояние до начала координат: " + new DecimalFormat("#0.00").format(dist));
    }

    public void checkOneLine(PointRationalFraction a, PointRationalFraction b, PointRationalFraction c) {

        double AB = calculateDistance(a, b);
        double BC = calculateDistance(b, c);
        double AC = calculateDistance(a, c);

        double per = AB + BC + AC;
        double halfPer = per / 2;

        double res = Math.sqrt(halfPer * (halfPer - AB) * (halfPer - BC) * (halfPer - AC));
        if(res == 0) {
            System.out.println("Прямые лежат на одной прямой");
        } else {
            System.out.println("Прямые не лежат на одной прямой");
        }
    }

    public double findSqrt(RationalFraction a) {
        return Math.sqrt(a.getNumerator()) / Math.sqrt(a.getDenominator());
    }
}
