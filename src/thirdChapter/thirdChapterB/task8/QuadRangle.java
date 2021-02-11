package thirdChapter.thirdChapterB.task8;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task6.Point;

@Data
@AllArgsConstructor
public class QuadRangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private QuadrangleType type;
    private double per;
    private double area;

    public double findPer() {
        // Векторы AB, BC, CD, AD
        Point ab = new Point((b.getX() - a.getX()), (b.getY() - a.getY()));
        Point bc = new Point((c.getX() - b.getX()), (c.getY() - b.getY()));
        Point cd = new Point((d.getX() - c.getX()), (d.getY() - c.getY()));
        Point ad = new Point((d.getX() - a.getX()), (d.getY() - a.getY()));

        Point ac = new Point((c.getX() - a.getX()), (c.getY() - a.getY()));
        Point bd = new Point((d.getX() - b.getX()), (d.getY() - b.getY()));


        // Модули векторов
        double AB = Math.sqrt(Math.pow(ab.getX(), 2) + Math.pow(ab.getY(), 2));
        double BC = Math.sqrt(Math.pow(bc.getX(), 2) + Math.pow(bc.getY(), 2));
        double CD = Math.sqrt(Math.pow(cd.getX(), 2) + Math.pow(cd.getY(), 2));
        double AD = Math.sqrt(Math.pow(ad.getX(), 2) + Math.pow(ad.getY(), 2));
        // Диагонали
        double AC = Math.sqrt(Math.pow(ac.getX(), 2) + Math.pow(ac.getY(), 2));
        double BD = Math.sqrt(Math.pow(bd.getX(), 2) + Math.pow(bd.getY(), 2));

        setQuadrangleType(AB, BC, CD, AD, AC, BD);

        this.setPer(AB + BC + CD + AD);
        return AB + BC + CD + AD;
    }

    public void setQuadrangleType(double a, double b, double c, double d, double e, double f) {
        double cos = Math.cos(Math.atan2(a, b));
        if ((a == b && a == c && a == d) && cos == 0d) {
            this.setType(QuadrangleType.SQUARE);
            this.setArea(findSquareArea(a));
        } else if ((a == b && a == c && a == d) && cos != 0d) {
            this.setType(QuadrangleType.RHOMBUS);
            this.setArea(findRhombusArea(e, f));
        } else if ((a == d) && (b == c) && cos == 0d) {
            this.setType(QuadrangleType.RECTANGLE);
            this.setArea(findRectangleArea(a, b));
        } else {
            this.setType(QuadrangleType.ARBITRARY);
            this.setArea(findArbitraryArea(e, f));
        }

    }

    private double findSquareArea(double a) {
        return Math.pow(a, 2);
    }

    private double findRhombusArea(double a, double b) {
        return (a * b) / 2;
    }

    private double findRectangleArea(double a, double b) {
        return a * b;
    }

    private double findArbitraryArea(double a, double b) {
        return (a * b) * (Math.sin(Math.atan2(a, b))) / 2;
    }

}

enum QuadrangleType {
    SQUARE, RECTANGLE, RHOMBUS, ARBITRARY
}
