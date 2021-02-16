package thirdChapter.thirdChapterC.task2;

import thirdChapter.thirdChapterB.task1.RationalFraction;
import thirdChapter.thirdChapterB.task1.RationalFractionUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class LineFractionUtils {

    //TODO перечение

    private LineFraction createLineFraction() {
        RationalFraction a = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction b = new RationalFraction((int)(1+Math.random()*11), 9);
        RationalFraction c = new RationalFraction((int)(1+Math.random()*11), 9);
        return new LineFraction(a, b, c);
    }

    public ArrayList<LineFraction> createArray() {
        ArrayList<LineFraction> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество прямых: ");
        int amount = sc.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createLineFraction());
        }
        return res;
    }

    public void findInsertionPoints(ArrayList<LineFraction> lines) {
        for (LineFraction line : lines) {
            System.out.println(line.getInsertionPointWithX());
            System.out.println(line.getInsertionPointWithY());
        }
    }

    public void findParallelLines(ArrayList<LineFraction> lines) {
        RationalFractionUtils rationalFractionUtils = new RationalFractionUtils();
        ArrayList<LineFraction> group = new ArrayList<>();
        for(LineFraction lineFraction : lines) {
            group.add(lineFraction);
            for(LineFraction value : lines) {
                if(value.equals(lineFraction)) {
                    break;
                }
                RationalFraction coefA = rationalFractionUtils.division(lineFraction.getA(), value.getA());
                RationalFraction coefB = rationalFractionUtils.division(lineFraction.getB(), value.getB());
                RationalFraction coefC = rationalFractionUtils.division(lineFraction.getC(), value.getC());

                RationalFraction divAB = rationalFractionUtils.division(coefA, coefB);
                RationalFraction divAC = rationalFractionUtils.division(coefA, coefC);

                if (divAB.getNumerator() == divAB.getDenominator() && divAC.getNumerator() == divAC.getDenominator()) {
                    group.add(value);
                }
            }
            if(group.size() != 1) {
                System.out.println("Группа прямых:");
                group.forEach(System.out::println);
            }
            group.clear();
        }
    }
}
