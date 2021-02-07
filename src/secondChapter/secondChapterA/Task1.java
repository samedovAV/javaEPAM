package secondChapter.secondChapterA;

import java.util.ArrayList;
import java.util.Comparator;

public class Task1 {
    /**
     * Находит в исходном массиве самое короткое и самое длинные числа, выводит их с указанием длины
     * @param list исходный массив
     */
    public void findLongestAndShortestNums(ArrayList<Integer> list) {
        int longest = list.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        String longestNum = String.valueOf(longest);
        int shortest = list.stream().min(Comparator.comparingInt(Integer::intValue)).get();
        String shortestNum = String.valueOf(shortest);

        System.out.println("The shortest number is " + shortest + " with length " + shortestNum.length());
        System.out.println("The longest number is " + longest + " with length " + longestNum.length());
    }
}
