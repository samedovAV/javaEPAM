package thirdChapter.thirdChapterC.task9;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task6.Point;

@Data
@AllArgsConstructor
public class TrianglePoint {
    private Point a;
    private Point b;
    private Point c;
    private TriangleType type;

    public double findArea() {
        double area;

        double deter = ((a.getX() - c.getX()) * (b.getY() - c.getY()))
                - (((b.getX() - c.getX()) * (a.getY() - c.getY())));

        area = Math.abs(deter) / 2;
        return area;
    }

    public double findPer() {
        // Векторы AB, AC, BC
        Point ab = new Point((b.getX() - a.getX()), (b.getY()) - a.getY());
        Point ac = new Point((c.getX() - a.getX()), (c.getY()) - a.getY());
        Point bc = new Point((c.getX() - b.getX()), (c.getY()) - b.getY());

        // Периметр
        double AB = Math.sqrt(Math.pow(ab.getX(), 2) + Math.pow(ab.getY(), 2));
        double AC = Math.sqrt(Math.pow(ac.getX(), 2) + Math.pow(ac.getY(), 2));
        double BC = Math.sqrt(Math.pow(bc.getX(), 2) + Math.pow(bc.getY(), 2));

        setTriangleType(AB, AC, BC);

        return AB + AC + BC;
    }

    public void setTriangleType(double a, double b, double c) {
        double powedA = a * a;
        double powedB = b * b;
        double powedC = c * c;
        if (a == b && a == c && b == c) {
            this.setType(TriangleType.EQUILATERAL);
        }
        else if (a == b || a == c || b == c) {
            this.setType(TriangleType.ISOSCELES);
        }
        else if((powedA == powedB + powedC) ||
                (powedB == powedA + powedC) ||
                (powedC == powedB + powedA)) {
            this.setType(TriangleType.RIGHT);
        }
        else  {
            this.setType(TriangleType.ARBITRARY);
        }
    }
}

enum TriangleType {
    EQUILATERAL, ISOSCELES, RIGHT, ARBITRARY
}
