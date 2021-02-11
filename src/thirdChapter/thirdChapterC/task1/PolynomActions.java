package thirdChapter.thirdChapterC.task1;

import thirdChapter.thirdChapterB.task1.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PolynomActions {

    public ArrayList<Polynom> createPolynomials() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество полиномов: ");
        int amount = scanner.nextInt(); // Количество полиномов

        ArrayList<Polynom> res = new ArrayList<>();
        System.out.print("Введите степень: ");
        int degree = scanner.nextInt(); // Степень полинома

        for (int i = 0; i < amount; i++) {
            ArrayList<RationalFraction> coefficients = new ArrayList<>(Main.createFractions(degree));
            res.add(new Polynom(degree, coefficients));
            System.out.println(res.get(i));
        }
        return res;
    }

    public Polynom findSum(ArrayList<Polynom> polynoms) {

        Polynom res = new Polynom();

        res.setDegree(polynoms.get(0).getDegree());
        res.setCoefficients(findCoefSum(polynoms));
        return res;
    }

    public ArrayList<RationalFraction> findCoefSum(ArrayList<Polynom> polynoms) {
        ArrayList<RationalFraction> res = new ArrayList<>();
        ArrayList<ArrayList<RationalFraction>> coefs = new ArrayList<>();
        int degree = polynoms.get(0).getDegree();
        for (Polynom pol : polynoms) {
            coefs.add(pol.getCoefficients());
        }

        int num;
        int dec;

        for(int i = 0; i < degree; i++) {
            num = 0;
            dec = 0;
            for (ArrayList<RationalFraction> fr : coefs) {
                num += fr.get(i).getNumerator();
                dec = fr.get(i).getDenominator();
            }
            res.add(new RationalFraction(num, dec));
        }

        return res;
    }
}
