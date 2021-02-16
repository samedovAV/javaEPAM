package thirdChapter.thirdChapterB.task1;

import java.util.ArrayList;

public class Main {
    /**
     * Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
     * Объявить и инициализировать массив из k дробей, ввести/вывести значения
     * для массива дробей. Создать массив/список/множество объектов и передать
     * его в метод, который изменяет каждый элемент массива с четным
     * индексом путем добавления следующего за ним элемента.
    */
    public static void main(String[] args) {
        ArrayList<RationalFraction> fractions = new ArrayList<>(createFractions(4));
        fractions.forEach(System.out::println);

        RationalFractionUtils actions = new RationalFractionUtils();
        System.out.print("\n");
        actions.addition(fractions);
    }

    public static ArrayList<RationalFraction> createFractions(int k) {
        ArrayList<RationalFraction> res = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            RationalFraction fraction = new RationalFraction((int)(1+Math.random()*11), 9);
            res.add(fraction);
        }

        return res;
    }
}
