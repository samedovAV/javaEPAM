package secondChapterA;

import java.util.ArrayList;

public class Task6 {
    /**
     * Выводит на консоль число, цифры в котором по возрастанию
     * @param list исходный массив
     */
    public void digitsOneByOne(ArrayList<Integer> list) {
        for (int num : list) {
            if(checkOneByOne(num)) {
                System.out.println("Число, в котором цифры идут по возрастанию: " + num);
                break;
            }
        }
    }

    public static boolean checkOneByOne(int num) {
        boolean flag = false;

        StringBuilder s = new StringBuilder();
        while(num>0) {
            int last = num % 10;
            num = num / 10;
            if (last > num % 10) {
                s.insert(0, num%10);
            }
        }

        String number = String.valueOf(num);
        if (s.length() == number.length() / 2) {
            flag = true;
        }
        return flag;
    }
}
