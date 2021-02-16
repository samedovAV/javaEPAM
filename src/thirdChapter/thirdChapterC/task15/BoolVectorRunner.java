package thirdChapter.thirdChapterC.task15;

import java.util.Scanner;

public class BoolVectorRunner {
    /**
     * Построить класс Булев вектор (BoolVector). Реализовать методы для выполнения поразрядных конъюнкции,
     * дизъюнкции и отрицания векторов, а также подсчета числа единиц и нулей в векторе.
    */
    public static void main(String[] args) {
        BoolVectorUtils boolVectorUtils = new BoolVectorUtils();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность векторов: ");
        int size = sc.nextInt();
        BoolVector boolVectorA = boolVectorUtils.createBoolVector(size);
        BoolVector boolVectorB = boolVectorUtils.createBoolVector(size);
        System.out.println(boolVectorA);
        System.out.println(boolVectorB);

        System.out.println("Конъюнкция " + boolVectorUtils.conjunction(boolVectorA, boolVectorB));
        System.out.println("Дизъюнкция " + boolVectorUtils.disjunction(boolVectorA, boolVectorB));
        System.out.print("Отрицание: ");
        boolVectorUtils.negation(boolVectorA);
        System.out.println("Количество единииц в векторе: " + boolVectorB + ": " + boolVectorUtils.countOnes(boolVectorB));
        System.out.println("Количество нулей в векторе: " + boolVectorB + ": " + boolVectorUtils.countZeros(boolVectorB));
    }
}
