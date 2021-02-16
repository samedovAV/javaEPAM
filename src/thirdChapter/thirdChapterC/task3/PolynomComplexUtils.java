package thirdChapter.thirdChapterC.task3;

import thirdChapter.thirdChapterB.task2.Complex;
import thirdChapter.thirdChapterB.task2.ComplexActions;

import java.util.ArrayList;
import java.util.Scanner;

public class PolynomComplexUtils {

    private ArrayList<Complex> createCoefficients(int degree) {
        ComplexActions complexActions = new ComplexActions();
        ArrayList<Complex> res = new ArrayList<>();
        for(int i = 0; i < degree; i++) {
            res.add(complexActions.createComplex());
        }
        return res;
    }

    private PolynomComplex createPolynomComplex(int degree) {
        ArrayList<Complex> coefficients = createCoefficients(degree);
        return new PolynomComplex(degree, coefficients);
    }

    public ArrayList<PolynomComplex> createArray() {
        ArrayList<PolynomComplex> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество полиномов: ");
        int m = sc.nextInt();
        System.out.print("Введите степень полинома: ");
        int degree = sc.nextInt();
        for(int i = 0; i < m; i++) {
            res.add(createPolynomComplex(degree));
        }
        return res;
    }

    public PolynomComplex findPolSum(ArrayList<PolynomComplex> polynoms) {
        return new PolynomComplex(polynoms.get(0).getDegree(), findCoefSum(polynoms));
    }

    private ArrayList<Complex> findCoefSum(ArrayList<PolynomComplex> polynoms) {
        ArrayList<Complex> res = new ArrayList<>();
        ArrayList<ArrayList<Complex>> coefs = new ArrayList<>();
        int degree = polynoms.get(0).getDegree();
        for(PolynomComplex pc : polynoms) {
            coefs.add(pc.getCoefficients());
        }

        for (int i = 0; i < degree; i++) {
            double newRe = 0;
            double newIm = 0;
            for (ArrayList<Complex> c : coefs) {
                newRe += c.get(i).getRe();
                newIm += c.get(i).getIm();
            }
            res.add(new Complex(newRe, newIm));
        }
        return res;
    }
}
