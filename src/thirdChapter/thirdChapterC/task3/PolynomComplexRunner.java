package thirdChapter.thirdChapterC.task3;

import java.util.ArrayList;

public class PolynomComplexRunner {
    /**
    Определить класс Полином с коэффициентами типа Комплексное число.
    Объявить массив/список/множество из m полиномов и определить сумму
    полиномов массива
    */
    public static void main(String[] args) {
        PolynomComplexUtils polynomComplexUtils = new PolynomComplexUtils();

        ArrayList<PolynomComplex> polynomComplexes = polynomComplexUtils.createArray();
        polynomComplexes.forEach(System.out::println);
        System.out.println();
        PolynomComplex polynomComplex = polynomComplexUtils.findPolSum(polynomComplexes);
        System.out.println(polynomComplex.toString());
    }
}
