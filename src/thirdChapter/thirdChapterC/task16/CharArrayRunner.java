package thirdChapter.thirdChapterC.task16;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CharArrayRunner {
    /**
     * Определить класс Множество символов. Реализовать методы для определения принадлежности
     * заданного элемента множеству; пересечения, объединения, разности двух множеств.
     * Создать методы сложения, вычитания, умножения (пересечения), индексирования, присваивания.
     * Создать массив объектов и передавать пары объектов в метод другого класса, который
     * строит множество, состоящее из элементов, входящих только в одно из заданных множеств.
     */
    public static void main(String[] args) {
        CharArrayUtils arrayUtils = new CharArrayUtils();

        Scanner sc = new Scanner(System.in);
        int elementsAmount = sc.nextInt();

        ArrayList<Character> elements = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < elementsAmount; i++) {
            elements.add((char)(random.nextInt(26) + 'a'));
        }
        CharArray array = new CharArray(elements);

        elements.clear();
        random = new Random();
        for(int i = 0; i < elementsAmount; i++) {
            elements.add((char)(random.nextInt(26) + 'a'));
        }
        CharArray arrayAnother = new CharArray(elements);

        for (char n : array.getElements()) {
            System.out.print(n + " ");
        }
        System.out.println();

        for (char n : arrayAnother.getElements()) {
            System.out.print(n + " ");
        }
        System.out.println();

        arrayUtils.checkElement(array.getElements(), 's');
        arrayUtils.crossing(array.getElements(), arrayAnother.getElements());
        System.out.println();
        arrayUtils.unite(array.getElements(), arrayAnother.getElements());
        arrayUtils.substr(array.getElements(), arrayAnother.getElements());
    }
}
