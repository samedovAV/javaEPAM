package secondChapter.secondChapterA;

import java.util.ArrayList;

public class Task5 {
    /**
     * Выводит на консоль количество чисел только с четными цифрами
     * @param list исходный массив
     */
    public void findOddDigits(ArrayList<Integer> list) {
        int res = 0;
        for (int num : list) {
            if(checkOdd(num)) {
                res++;
            }
        }
        System.out.println("Количество чисел только с четными цифрами: " + res);
    }

    public static boolean checkOdd(int num) {
        boolean flag = false;

        StringBuilder s = new StringBuilder();
        while(num>0) {
            if ((num%10) % 2 == 0) {
                s.insert(0, num%10);
            }
            num = num / 10;
        }

        // Количество четных цифр должно быть равно длине самого числа
        String number = String.valueOf(num);
        if (s.length() == number.length()) {
            flag = true;
        }
        return flag;
    }
}
