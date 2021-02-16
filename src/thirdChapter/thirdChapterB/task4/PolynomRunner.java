package thirdChapter.thirdChapterB.task4;

import java.util.ArrayList;

public class PolynomRunner {
    /**
     * Определить класс Полином степени n. Объявить массив/список/множество
     * из m полиномов и определить сумму полиномов массива.
    */
    public static void main(String[] args) {
        ArrayList<Polynom> polynoms;

        PolynomUtils polynomUtils = new PolynomUtils();
        polynoms = polynomUtils.createArray();
        Polynom polynom = polynomUtils.findPolSum(polynoms);
        System.out.println(polynom);
    }
}
