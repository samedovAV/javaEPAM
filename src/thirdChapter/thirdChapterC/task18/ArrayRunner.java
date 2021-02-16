package thirdChapter.thirdChapterC.task18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayRunner {
    /**
     * Определить класс Массив. Создать методы сортировки: обменная сортировка (метод пузырька);
     * обменная сортировка «Шейкер-сортировка», сортировка посредством выбора (метод простого выбора),
     * сортировка вставками: метод хеширования (сортировка с вычислением адреса),
     * сортировкавставками (метод простых вставок), сортировка бинарного слияния,
     * сортировка Шелла (сортировка с убывающим шагом).
    */
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        Scanner sc = new Scanner(System.in);
        int elementsAmount = sc.nextInt();

        ArrayList<Integer> elements = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < elementsAmount; i++) {
            elements.add(random.nextInt(20) + 1);
        }
        Array array = new Array(elements);
        for (int n : array.getElements()) {
            System.out.print(n + " ");
        }
        System.out.println();

        arrayUtils.bubbleSort(array.getElements());
        arrayUtils.shakerSort(array.getElements());
        arrayUtils.selectionSort(array.getElements());
        arrayUtils.insertionSort(array.getElements());
        arrayUtils.mergeSort(array.getElements().stream().mapToInt(i -> i).toArray(), elements.size());
        arrayUtils.shellSort(array.getElements());
    }
}
