package thirdChapter.thirdChapterB.task2;

import java.util.ArrayList;

public class ComplexMain {
    /**
     * Определить класс Комплекс. Создать массив/список/множество размерности
     * n из комплексных координат. Передать его в метод, который выполнит
     * сложение/умножение его элементов.
    */
    public static void main(String[] args) {
        ComplexActions actions = new ComplexActions();

        ArrayList<Complex> array = actions.createArray();
        actions.printArray(array);
        System.out.println();
        actions.sum(array);
        actions.multi(array);
    }
}
