package thirdChapter.thirdChapterB.task9;

import thirdChapter.thirdChapterB.task6.PointUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class CircleUtils {

    // TODO доделать

    private Circle createCircle() {
        PointUtils pointUtils = new PointUtils();
        Circle circle = new Circle();
        circle.setCenter(pointUtils.createPoint());
        circle.setRadius(1 + Math.random() + 10);
        circle.setArea(circle.findArea());
        circle.setPer(circle.findPer());
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
}
