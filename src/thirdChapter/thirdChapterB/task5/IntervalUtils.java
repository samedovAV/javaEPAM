package thirdChapter.thirdChapterB.task5;

import java.util.ArrayList;
import java.util.Scanner;

public class IntervalUtils {

    private Interval createInterval() {

        int left = (int)(Math.random()*10);
        int right = (int)(5 + Math.random()*20);
        // Если левая координата больше правой
        if(left > right) {
            int temp = left;
            left = right;
            right = left;
        }
        return new Interval(left, right);
    }

    public ArrayList<Interval> createIntervals() {
        ArrayList<Interval> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество интервалов: ");
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            res.add(createInterval());
        }
        return res;
    }

    public int findDistance(ArrayList<Interval> list) {
        int left = 0;
        int right = 0;
        for (Interval interval : list) {
            if (left > interval.getLeft()) {
                left = interval.getLeft();
            }
            if (right < interval.getRight()) {
                right = interval.getRight();
            }
        }
        return right-left;
    }
}
