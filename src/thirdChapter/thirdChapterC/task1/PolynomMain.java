package thirdChapter.thirdChapterC.task1;

import java.util.ArrayList;

public class PolynomMain {
    public static void main(String[] args) {
        PolynomActions polynomActions = new PolynomActions();

        ArrayList<Polynom> polynoms = polynomActions.createPolynomials();
        System.out.println("\n");
        Polynom newPolynom = polynomActions.findSum(polynoms);
        System.out.println(newPolynom);
    }
}
