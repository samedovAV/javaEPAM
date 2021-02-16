package thirdChapter.thirdChapterC.task4;

import thirdChapter.thirdChapterB.task2.Complex;

import java.util.ArrayList;
import java.util.Scanner;

public class ComlpexFractionUtils {

    private ComplexFraction createComplexFraction() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите действительную часть числителя: ");
        double reM = sc.nextInt();
        System.out.print("Введите мнимую часть числителя: ");
        double imM = sc.nextInt();

        System.out.print("Введите действительную часть знаменателя: ");
        double reN = sc.nextInt();
        System.out.print("Введите мнимую часть знаменателя: ");
        double imN = sc.nextInt();

        return new ComplexFraction(new Complex(reM, imM), new Complex(reN, imN));
    }

    public ArrayList<ComplexFraction> createArray() {
        ArrayList<ComplexFraction> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество дробей: ");
        int k = sc.nextInt();

        for(int i = 0; i < k; i++) {
            res.add(createComplexFraction());
        }

        return res;
    }

    public void modificateEven(ArrayList<ComplexFraction> fractions) {
        for(int i = 0; i < fractions.size() - 1; i += 2) {
            fractions.set(i, sum(fractions.get(i), fractions.get(i+1)));
        }
    }

    private ComplexFraction sum(ComplexFraction a, ComplexFraction b) {

        Complex oldAM = a.getM();
        Complex oldAN = a.getN();

        Complex oldBM = b.getM();
        Complex oldBN = b.getN();

        double newReM = (oldAM.getRe() * oldBN.getRe()) - (oldAM.getIm() * oldBN.getIm());
        double newImM = (oldAM.getRe() * oldBN.getIm()) + (oldAM.getIm() * oldAM.getRe());

        double newReN = (oldAN.getRe() * oldBM.getRe()) - (oldAN.getIm() * oldBM.getIm());
        double newImN = (oldAN.getRe() * oldBM.getIm()) + (oldAN.getIm() * oldBM.getRe());

        Complex newM = new Complex(newReM, newImM);
        Complex newN = new Complex(newReN, newImM);

        return new ComplexFraction(newM, newN);
    }
}
