package thirdChapter.thirdChapterC.task5;

import thirdChapter.thirdChapterB.task1.RationalFraction;
import thirdChapter.thirdChapterB.task1.RationalFractionUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexRationalFractionUtils {

    private ComplexRationalFraction createComplexRationalFraction() {
        RationalFraction re = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction im = new RationalFraction((int)(1+Math.random()*11), 9);
        return new ComplexRationalFraction(re, im);
    }

    public ArrayList<ComplexRationalFraction> createArray() {
        ArrayList<ComplexRationalFraction> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество комплексных чисел: ");
        int amount = scanner.nextInt();

        for (int i = 0; i < amount; i++) {
            res.add(createComplexRationalFraction());
        }
        return res;
    }

    public void performAddition(ArrayList<ComplexRationalFraction> fractions) {
        RationalFraction newIm = new RationalFraction();
        RationalFraction newRe = new RationalFraction();

        ArrayList<RationalFraction> allRe = new ArrayList<>();
        ArrayList<RationalFraction> allIm = new ArrayList<>();

        for (ComplexRationalFraction c : fractions) {
            allRe.add(c.getRe());
            allIm.add(c.getIm());
        }

        //TODO
        ComplexRationalFraction complexRationalFraction = new ComplexRationalFraction(newRe, newIm);

    }

    public void performMultiplication(ArrayList<ComplexRationalFraction> fractions) {
        RationalFraction newIm = new RationalFraction();
        RationalFraction newRe = new RationalFraction();

        ArrayList<RationalFraction> allRe = new ArrayList<>();
        ArrayList<RationalFraction> allIm = new ArrayList<>();

        //TODO

        ComplexRationalFraction complexRationalFraction = new ComplexRationalFraction(newRe, newIm);
    }
}
