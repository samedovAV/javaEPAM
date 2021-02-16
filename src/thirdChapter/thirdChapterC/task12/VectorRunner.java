package thirdChapter.thirdChapterC.task12;

import java.text.DecimalFormat;

public class VectorRunner {
    /**
     * Определить класс Вектор. Реализовать методы для вычисления модуля
     * вектора, скалярного произведения, сложения, вычитания, умножения на
     * константу. Объявить массив объектов. Написать метод, который для заданной
     * пары векторов будет определять, являются ли они коллинеарными или ортогональными.
     */
    public static void main(String[] args) {
        VectorUtils vectorUtils = new VectorUtils();

        Vector a = vectorUtils.createVector();
        System.out.println(a.toString());
        Vector b = vectorUtils.createVector();
        System.out.println(b.toString());

        System.out.println("Модуль вектора равен: " + new DecimalFormat("#0.00").format(vectorUtils.findVectorModule(a)));
        System.out.println("Модуль вектора равен: " + new DecimalFormat("#0.00").format(vectorUtils.findVectorModule(b)));

        vectorUtils.add(a, b);

        vectorUtils.sub(a, b);

        vectorUtils.constMultiplication(a, 3);
        vectorUtils.constMultiplication(b, 2);

        vectorUtils.checkVectors(a, b);
    }
}
