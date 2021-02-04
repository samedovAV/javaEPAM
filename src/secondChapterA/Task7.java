package secondChapterA;

import java.util.ArrayList;

public class Task7 {
    /**
     * Выводит на консоль число, цифры в котором различны
     * @param list исходный массив
     */
    public void findDiffDigits(ArrayList<Integer> list) {
        for (int num : list) {
            if (checkDifferent(num)) {
                System.out.println("Число, в котором цифры различны: " + num);
                break;
            }
        }
    }

    public static boolean checkDifferent(int num) {
        boolean flag = false;

        StringBuilder s = new StringBuilder();
        while(num>0) {
            if ((num % 10) != (num / 10) % 10) {
                s.insert(0, num%10);
            }
            num = num / 10;
        }

        String number = String.valueOf(num);
        if (s.length() == number.length()) {
            flag = true;
        }
        return flag;
    }
}
