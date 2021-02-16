package thirdChapter.thirdChapterB.task7;

import thirdChapter.thirdChapterB.task6.Point;
import thirdChapter.thirdChapterB.task6.PointUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class TriangleUtils {

    private Triangle createTriangle() {
        PointUtils pointUtils = new PointUtils();
        Point a = pointUtils.createPoint();
        Point b = pointUtils.createPoint();
        Point c = pointUtils.createPoint();
        return new Triangle(a, b, c, null);
    }

    public ArrayList<Triangle> createArray() {
        ArrayList<Triangle> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество треугольников: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createTriangle());
        }
        return res;
    }

    public void findTypeAndArea(ArrayList<Triangle> list) {

        list.forEach(Triangle::findPer);
        list.forEach(System.out::println);

        int eq = 0;
        int is = 0;
        int ri = 0;
        int ar = 0;

        ArrayList<Triangle> eqs = new ArrayList<>();
        ArrayList<Triangle> iss = new ArrayList<>();
        ArrayList<Triangle> ris = new ArrayList<>();
        ArrayList<Triangle> ars = new ArrayList<>();

        for (Triangle tr : list) {
            if (tr.getType().equals(Type.EQUILATERAL)) {
                eq++;
                eqs.add(tr);
            } else if (tr.getType().equals(Type.ISOSCELES)) {
                is++;
                iss.add(tr);
            } else if (tr.getType().equals(Type.RIGHT)) {
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

    public void calculateAreaInGroup(ArrayList<Triangle> triangles) {
        if (triangles.isEmpty()) {
            return;
        }
        double area = triangles.get(0).findArea();
        for(Triangle tr : triangles) {
            if (area > tr.findArea()) {
                area = tr.findArea();
            }
        }
        System.out.println("Самая маленькая площадь: " + new DecimalFormat("#0.00").format(area));
    }

    public void calculatePerInGroup(ArrayList<Triangle> triangles) {
        if (triangles.isEmpty()) {
            return;
        }
        double per = triangles.get(0).findPer();
        for(Triangle tr : triangles) {
            if (per > tr.findPer()) {
                per = tr.findPer();
            }
        }
        System.out.println("Самая маленький периметр: " + new DecimalFormat("#0.00").format(per));
    }
}
