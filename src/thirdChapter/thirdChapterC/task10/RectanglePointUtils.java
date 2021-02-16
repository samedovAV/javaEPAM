package thirdChapter.thirdChapterC.task10;

import thirdChapter.thirdChapterB.task6.Point;
import thirdChapter.thirdChapterB.task6.PointUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class RectanglePointUtils {
    private RectanglePoint creareQuadrangle() {
        PointUtils pointUtils = new PointUtils();
        Point a = pointUtils.createPoint();
        Point b = pointUtils.createPoint();
        Point c = pointUtils.createPoint();
        Point d = pointUtils.createPoint();

        return new RectanglePoint(a, b, c, d, null, 0, 0);
    }

    public ArrayList<RectanglePoint> createArray() {
        ArrayList<RectanglePoint> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество четырехугольников: ");
        int amount = sc.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(creareQuadrangle());
        }
        return res;
    }

    public void findTypeAndArea(ArrayList<RectanglePoint> list) {

        list.forEach(RectanglePoint::findPer);
        list.forEach(System.out::println);

        int sqr = 0;
        int rec = 0;
        int rho = 0;
        int arb = 0;

        ArrayList<RectanglePoint> sqrs = new ArrayList<>();
        ArrayList<RectanglePoint> recs = new ArrayList<>();
        ArrayList<RectanglePoint> rhos = new ArrayList<>();
        ArrayList<RectanglePoint> arbs = new ArrayList<>();

        for (RectanglePoint qr : list) {
            if (qr.getType().equals(RectangleType.SQUARE)) {
                sqr++;
                sqrs.add(qr);
            } else if (qr.getType().equals(RectangleType.RECTANGLE)) {
                rec++;
                recs.add(qr);
            } else if (qr.getType().equals(RectangleType.RHOMBUS)) {
                rho++;
                rhos.add(qr);
            } else  {
                arb++;
                arbs.add(qr);
            }
        }

        System.out.println("Среди многоугольников: квадратов: " + sqr +
                " прямоугольников: " + rec + " ромбов: " + rho + " произвольных: " + arb);

        if(sqr != 0) {
            System.out.println("Для квадратов");
            calculatePerInGroup(sqrs);
            calculateAreaInGroup(sqrs);
        }

        if(rec != 0) {
            System.out.println("Для прямоугольников");
            calculatePerInGroup(recs);
            calculateAreaInGroup(recs);
        }

        if(rho != 0) {
            System.out.println("Для ромбов");
            calculatePerInGroup(rhos);
            calculateAreaInGroup(rhos);
        }

        if(arb != 0) {
            System.out.println("Для произвольных");
            calculatePerInGroup(arbs);
            calculateAreaInGroup(arbs);
        }
    }

    private void calculateAreaInGroup(ArrayList<RectanglePoint> quadRangles) {
        if (quadRangles.isEmpty()) {
            return;
        }
        double area = quadRangles.get(0).getArea();
        for(RectanglePoint qr : quadRangles) {
            if (area > qr.getArea()) {
                area = qr.getArea();
            }
        }
        System.out.println("Самая маленькая площадь: " + new DecimalFormat("#0.00").format(area));
    }

    private void calculatePerInGroup(ArrayList<RectanglePoint> quadRangles) {
        if (quadRangles.isEmpty()) {
            return;
        }
        double per = quadRangles.get(0).findPer();
        for(RectanglePoint qr : quadRangles) {
            if (per > qr.findPer()) {
                per = qr.findPer();
            }
        }
        System.out.println("Самая маленький периметр: " + new DecimalFormat("#0.00").format(per));
    }
}
