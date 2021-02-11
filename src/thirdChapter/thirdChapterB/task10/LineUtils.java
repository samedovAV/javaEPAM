package thirdChapter.thirdChapterB.task10;

import java.util.ArrayList;
import java.util.Scanner;

public class LineUtils {

    private Line createLine() {
        int a = (int)(1+ (Math.random() * 10));
        int b = (int)(1+ (Math.random() * 10));
        int c = (int)(1+ (Math.random() * 10));
        return new Line(a, b, c);
    }

    public ArrayList<Line> createArray() {
        ArrayList<Line> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество прямых: ");
        int amount = sc.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createLine());
        }
        return res;
    }

    public void findInsertionPoints(ArrayList<Line> lines) {
        for (Line line : lines) {
            System.out.println(line.getInsertionPointWithX());
            System.out.println(line.getInsertionPointWithY());
        }
    }

    public void findParallelLines(ArrayList<Line> list) {
        ArrayList<Line> group = new ArrayList<>();
        for(Line line : list) {
            group.add(line);
            for (Line value : list) {
                double coefA = line.getA() / value.getA();
                double coefB = line.getB() / value.getB();
                double coefC = line.getC() / value.getC();
                if (coefA == coefB && coefA == coefC && (coefA != 1)) {
                    group.add(value);
                }
            }
            if (group.size() != 1) {
                System.out.println("Группа прямых:");
                group.forEach(System.out::println);
            }
            group.clear();
        }

    }
}
