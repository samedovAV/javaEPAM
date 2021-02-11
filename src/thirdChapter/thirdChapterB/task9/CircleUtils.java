package thirdChapter.thirdChapterB.task9;

import thirdChapter.thirdChapterB.task6.PointUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleUtils {

    private Circle createCircle() {
        PointUtils pointUtils = new PointUtils();
        Circle circle = new Circle();
        circle.setCenter(pointUtils.createPoint());
        circle.setRadius(Math.round((1 + (Math.random() * 10)) * 100.0) / 100.0);
        circle.setArea(Math.round(circle.findArea() * 100.0) / 100.0);
        circle.setPer(Math.round(circle.findPer() * 100.0) / 100.0);
        return circle;
    }

    public ArrayList<Circle> createArray() {
        ArrayList<Circle> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество окружностей: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createCircle());
        }
        return res;
    }

    public void findMinPer(ArrayList<Circle> list) {
        double minPer = list.get(0).getPer();
        for(Circle circle : list) {
            if(minPer > circle.getPer()) {
                minPer = circle.getPer();
            }
        }
        System.out.println("Самый маленький периметр: " + minPer);
    }

    public void findMinArea(ArrayList<Circle> list) {
        double minArea = list.get(0).getArea();
        for(Circle circle : list) {
            if(minArea > circle.getArea()) {
                minArea = circle.getArea();
            }
        }
        System.out.println("Самая маленькая площадь: " + minArea);
    }

    public void findOnOneLine(ArrayList<Circle> list) {

        ArrayList<Circle> group = new ArrayList<>();
        for (Circle firstCircle : list) {
            group.add(firstCircle);
            for (int j = 0; j < group.size(); j++) {
                int radSum = (int) (firstCircle.getRadius() + list.get(j).getRadius());
                int dist = list.get(j).getCenter().getX() - firstCircle.getCenter().getX();
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
}
