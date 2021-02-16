package thirdChapter.thirdChapterC.task9;

import thirdChapter.thirdChapterB.task6.Point;
import thirdChapter.thirdChapterB.task6.PointUtils;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TrianglePointUtils {
    private TrianglePoint createTriangle() {
        PointUtils pointUtils = new PointUtils();
        Point a = pointUtils.createPoint();
        Point b = pointUtils.createPoint();
        Point c = pointUtils.createPoint();
        return new TrianglePoint(a, b, c, null);
    }

    public ArrayList<TrianglePoint> createArray() {
        ArrayList<TrianglePoint> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество треугольников: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createTriangle());
        }
        return res;
    }

    public void findTypeAndArea(ArrayList<TrianglePoint> list) {

        list.forEach(TrianglePoint::findPer);
        list.forEach(System.out::println);

        int eq = 0;
        int is = 0;
        int ri = 0;
        int ar = 0;

        ArrayList<TrianglePoint> eqs = new ArrayList<>();
        ArrayList<TrianglePoint> iss = new ArrayList<>();
        ArrayList<TrianglePoint> ris = new ArrayList<>();
        ArrayList<TrianglePoint> ars = new ArrayList<>();

        for (TrianglePoint tr : list) {
            if (tr.getType().equals(TriangleType.EQUILATERAL)) {
                eq++;
                eqs.add(tr);
            } else if (tr.getType().equals(TriangleType.ISOSCELES)) {
                is++;
                iss.add(tr);
            } else if (tr.getType().equals(TriangleType.RIGHT)) {
                ri++;
                ris.add(tr);
            } else  {
                ar++;
                ars.add(tr);
            }
        }

        System.out.println("Среди треугольников: равносторонних: " + eq +
                " равнобедренных: " + is + " прямоугольных: " + ri + " произвольных: " + ar);

        if(eq != 0) {
            System.out.println("Для равносторонних:");
            calculateAreaInGroup(eqs);
            calculatePerInGroup(eqs);
        }

        if(is != 0) {
            System.out.println("Для равнобедренных:");
            calculateAreaInGroup(iss);
            calculatePerInGroup(iss);
        }

        if(ri != 0) {
            System.out.println("Для прямоугольных:");
            calculateAreaInGroup(ris);
            calculatePerInGroup(ris);
        }

        if(ar != 0) {
            System.out.println("Для произвольных:");
            calculateAreaInGroup(ars);
            calculatePerInGroup(ars);
        }
    }

    public void calculateAreaInGroup(ArrayList<TrianglePoint> triangles) {
        if (triangles.isEmpty()) {
            return;
        }
        double area = triangles.get(0).findArea();
        for(TrianglePoint tr : triangles) {
            if (area > tr.findArea()) {
                area = tr.findArea();
            }
        }
        System.out.println("Самая маленькая площадь: " + new DecimalFormat("#0.00").format(area));
    }

    public void calculatePerInGroup(ArrayList<TrianglePoint> triangles) {
        if (triangles.isEmpty()) {
            return;
        }
        double per = triangles.get(0).findPer();
        for(TrianglePoint tr : triangles) {
            if (per > tr.findPer()) {
                per = tr.findPer();
            }
        }
        System.out.println("Самая маленький периметр: " + new DecimalFormat("#0.00").format(per));
    }
}
