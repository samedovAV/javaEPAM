package thirdChapter.thirdChapterB.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<RationalFraction> fractions = new ArrayList<>(createFractions(4));
        fractions.forEach(System.out::println);

        Actions actions = new Actions();
        System.out.println("\n");
        actions.addition(fractions);
    }

    public static ArrayList<RationalFraction> createFractions(int k) {
        ArrayList<RationalFraction> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            RationalFraction fraction = new RationalFraction((int)(1+Math.random()*11), 9);
            res.add(fraction);
        }

        return res;
    }
}
