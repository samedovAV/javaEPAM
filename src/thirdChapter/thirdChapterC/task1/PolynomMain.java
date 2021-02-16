package thirdChapter.thirdChapterC.task1;

import java.util.ArrayList;

public class PolynomMain {
    /**
     * Определить класс Полином c коэффициентами типа Рациональная
     * Дробь. Объявить массив/список/множество из n полиномов и определить
     * сумму полиномов массива.
    */
    public static void main(String[] args) {
        PolynomActions polynomActions = new PolynomActions();

        ArrayList<Polynom> polynoms = polynomActions.createPolynomials();
        System.out.print("\n");
        Polynom newPolynom = polynomActions.findSum(polynoms);
        System.out.println(newPolynom);
    }
}
