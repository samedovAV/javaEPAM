package secondChapter.secondChapterA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task2 {
    /**
     * Сортирует и выводит по возрастанию значений длины
     * @param list исходный массив
     */
    public void sortWithLength(ArrayList<Integer> list) {
        Collections.sort(list);
        System.out.println("По порядку убывания длины: " + list.stream().map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
