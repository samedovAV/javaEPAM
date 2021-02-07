package secondChapter.secondChapterA;

import java.util.ArrayList;

public class Task4 {
    /**
     * Выводит на консоль число с минимальным количеством цифр
     * @param list исходный массив
     */
    public  void findNumWithDifDigits(ArrayList<Integer> list) {
        // Преобразуем в массив строк
        ArrayList<String> numbers = TaskA.convertToStringList(list);

        for(String number : numbers) {
            if(checkNum(number)) {
                System.out.println("Число с минимальным количеством одинаковых цифр: " + number);
            }
        }
    }

    public static boolean checkNum(String num) {
        int[] digitsInNum = new int[10]; // Количество цифр в одном числе
        boolean flag = true;

        for (char c: num.toCharArray()) {
            digitsInNum[Character.getNumericValue(c)] += 1;
            // Если одна и та же цифра повторяется в числе
            if (digitsInNum[Character.getNumericValue(c)] > 1) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
