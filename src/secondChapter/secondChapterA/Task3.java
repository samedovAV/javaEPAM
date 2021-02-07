package secondChapter.secondChapterA;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Task3 {

    /**
     * Выводит на консоль те числа, длина которых меньше (больше) средней,
     * а также длину
     * @param list исходный массив
     */
    public void numsWithLengthMoreThanAverage(ArrayList<Integer> list) {
        // Преобразуем в массив строк для подсчета длины каждого числа
        ArrayList<String> numbers = new ArrayList<>();
        for(int num : list) {
            numbers.add(String.valueOf(num));
        }

        int lengthOfAll = 0;
        for (String num : numbers) {
            lengthOfAll += num.length();
        }

        // Либо можно так: numbers.stream().map(Object::toString).collect(Collectors.joining()).length()
        int averageLength = lengthOfAll / numbers.size();

        ArrayList<String> result = new ArrayList<>();
        ArrayList<Integer> resultLength = new ArrayList<>();
        for (String num : numbers) {
            // Больше средней - поменять знак
            if (num.length() < averageLength) {
                result.add(num);
                resultLength.add(num.length());
            }
        }
        System.out.println("Числа, длина которых меньше средней: " + String.join(" ", result) + " с длинами " +
                resultLength.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
