package thirdChapter.thirdChapterB.task1;

import java.util.ArrayList;

public class Actions {

    public void addition(ArrayList<RationalFraction> fractions) {
        ArrayList<RationalFraction> res = new ArrayList<>();
        for(int i = 0; i < fractions.size() - 1; i+=2) {
            int newNumerator = fractions.get(i).getNumerator() + fractions.get(i+1).getNumerator();
            int newDenominator = fractions.get(i).getDenominator(); //TODO добавить сложение с разными знаменателями
            res.add(new RationalFraction(newNumerator, newDenominator));
        }
        res.forEach(System.out::println);
    }
}
