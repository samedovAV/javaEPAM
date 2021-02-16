package thirdChapter.thirdChapterC.task6;

import thirdChapter.thirdChapterB.task1.RationalFraction;
import thirdChapter.thirdChapterB.task1.RationalFractionUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleRationalFractionUtils {

    private CircleRationalFraction createCircle() {
        RationalFraction centerX = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction centerY = new RationalFraction((int)(1+Math.random()*11), 9);
        double radius = Math.round((1 + (Math.random() * 10)) * 100.0) / 100.0;
        return new CircleRationalFraction(centerX, centerY, radius);
    }

    public ArrayList<CircleRationalFraction> createArray() {
        ArrayList<CircleRationalFraction> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество окружностей: ");
        int amount = sc.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createCircle());
        }
        return res;
    }

    public double calculatePer(CircleRationalFraction circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public double calculateArea(CircleRationalFraction circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public void findOnOneLine(ArrayList<CircleRationalFraction> list) {
        RationalFractionUtils rationalFractionUtils = new RationalFractionUtils();
        ArrayList<CircleRationalFraction> group = new ArrayList<>();
        for (CircleRationalFraction firstCircle : list) {
            group.add(firstCircle);
            for (int j = 0; j < group.size(); j++) {
                int radSum = (int) (firstCircle.getRadius() + list.get(j).getRadius());
                RationalFraction temp = rationalFractionUtils.sub(list.get(j).getCenterX(), firstCircle.getCenterX());
                int dist = temp.getNumerator() / temp.getDenominator();
                if (radSum == dist) {
                    group.add(list.get(j));
                }
            }
            if (group.size() != 1) {
                System.out.println("Группа окружностей");
                group.forEach(System.out::println);
            }
            group.clear();
        }
    }

    public void findMinPer(ArrayList<CircleRationalFraction> list) {
        double minPer = calculatePer(list.get(0));
        for(CircleRationalFraction circle : list) {
            if(minPer > calculatePer(circle)) {
                minPer = calculatePer(circle);
            }
        }
        System.out.println("Самый маленький периметр: " + new DecimalFormat("#0.00").format(minPer));
    }

    public void findMinArea(ArrayList<CircleRationalFraction> list) {
        double minArea = calculateArea(list.get(0));
        for(CircleRationalFraction circle : list) {
            if(minArea > calculateArea(circle)) {
                minArea = calculateArea(circle);
            }
        }
        System.out.println("Самая маленькая площадь: " + new DecimalFormat("#0.00").format(minArea));
    }
}
