package thirdChapter.thirdChapterB.task1;

import java.util.ArrayList;

public class RationalFractionUtils {

    public void addition(ArrayList<RationalFraction> fractions) {
        ArrayList<RationalFraction> res = new ArrayList<>();
        for(int i = 0; i < fractions.size() - 1; i+=2) {
            int newNumerator = fractions.get(i).getNumerator() + fractions.get(i+1).getNumerator();
            int newDenominator = fractions.get(i).getDenominator(); //TODO добавить сложение с разными знаменателями
            res.add(new RationalFraction(newNumerator, newDenominator));
        }
        res.forEach(System.out::println);
    }

    public RationalFraction add(RationalFraction a, RationalFraction b) {
        int newNumenator = a.getNumerator() + b.getNumerator();
        return new RationalFraction(newNumenator, a.getDenominator());
    }

    public RationalFraction division(RationalFraction a, RationalFraction b) {
        int newNumerator = a.getNumerator() * b.getDenominator();
        int newDenominator = a.getDenominator() * b.getNumerator();
        return new RationalFraction(newNumerator, newDenominator);
    }

    public RationalFraction additionArray(ArrayList<RationalFraction> fractions) {
        int newNumenator = 0;
        int newDenominator = 0;
        for (RationalFraction r : fractions) {
            newNumenator += r.getNumerator();
            newDenominator += r.getDenominator();
        //TODO
        }
        return new RationalFraction(newNumenator, newDenominator);
    }
    
    public RationalFraction divisionArray(ArrayList<RationalFraction> fractions) {
        int newNumenator = 1;
        int newDenominator = 1;
        for (RationalFraction r : fractions) {
            newNumenator *= r.getNumerator();
            newDenominator *= r.getDenominator();
        }
        return new RationalFraction(newNumenator, newDenominator);
    }

    public RationalFraction negation(RationalFraction a) {
        return new RationalFraction(-(a.getNumerator()), a.getDenominator());
    }

    public RationalFraction pow(RationalFraction a, int degree) {
        return new RationalFraction((int)Math.pow(a.getNumerator(), degree), (int)Math.pow(a.getDenominator(), degree));
    }

    public RationalFraction sub(RationalFraction a, RationalFraction b) {
        return add(a, negation(b));
    }
}
