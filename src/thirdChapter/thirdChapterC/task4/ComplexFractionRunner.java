package thirdChapter.thirdChapterC.task4;

import java.util.ArrayList;

public class ComplexFractionRunner {
    /**
     * Определить класс Дробь в виде пары (m, n) с коэффициентами типа
     * Комплексное число. Объявить и инициализировать массив из k дробей, ввести/вывести
     * значения для массива дробей. Создать массив/список/множество объектов
     * и передать его в метод, который изменяет каждый элемент массива
     * с четным индексом путем добавления следующего за ним элемента.
     */
    public static void main(String[] args) {
        ComlpexFractionUtils comlpexFractionUtils = new ComlpexFractionUtils();

        ArrayList<ComplexFraction> complexFractions = comlpexFractionUtils.createArray();

        complexFractions.forEach(System.out::println);
        System.out.println();
        comlpexFractionUtils.modificateEven(complexFractions);
        complexFractions.forEach(System.out::println);
    }
}
