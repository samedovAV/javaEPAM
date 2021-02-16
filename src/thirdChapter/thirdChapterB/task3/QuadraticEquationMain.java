package thirdChapter.thirdChapterB.task3;

import java.util.ArrayList;

public class QuadraticEquationMain {
    /**
     * Определить класс Квадратное уравнение. Реализовать методы для поиска
     * корней, экстремумов, а также интервалов убывания/возрастания. Создать
     * массив/список/множество объектов и определить наибольшие и наименьшие по значению корни.
    */
    public static void main(String[] args) {
        ArrayList<QuadraticEquation> equations;

        QuadraticEquationUtils equationUtils = new QuadraticEquationUtils();

        equations = equationUtils.createArray();
        equationUtils.findMaxRoots(equations);
        equationUtils.findMinRoots(equations);
    }
}
