package secondChapter.secondChapterA;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TaskA {
    public static void main(String[] args) throws ParseException {

        // Ввод чисел с консоли
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            nums.add(scanner.nextInt());
        }

        Task1 task1 = new Task1();
        task1.findLongestAndShortestNums(nums);

        Task2 task2 = new Task2();
        task2.sortWithLength(nums);

        Task3 task3 = new Task3();
        task3.numsWithLengthMoreThanAverage(nums);

        Task4 task4 = new Task4();
        task4.findNumWithDifDigits(nums);

        Task5 task5 = new Task5();
        task5.findOddDigits(nums);

        Task6 task6 = new Task6();
        task6.digitsOneByOne(nums);

        Task7 task7 = new Task7();
        task7.findDiffDigits(nums);

        Task8 task8 = new Task8();
        task8.showPalindromes(nums);

        // Task9
        solveEquation(args[0], args[1], args[2]);

        developerAndDate();
    }

    public static void solveEquation(String aa, String bb, String cc) {
        double a = Double.parseDouble(aa);
        double b = Double.parseDouble(bb);
        double c = Double.parseDouble(cc);

        double d = b * b - 4 * a * c;
        if (d > 0) {
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }

    public static ArrayList<String> convertToStringList(ArrayList<Integer> list) {
        ArrayList<String> result = new ArrayList<>();
        for(int num : list) {
            result.add(String.valueOf(num));
        }
        return result;
    }

    public static void developerAndDate() throws ParseException {
        System.out.println("\n Samedov");
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date startDate = ft.parse("2021-02-03 10:56:00");
        System.out.println("Начало: "  + startDate);
        System.out.println("Конец: " + date.toString());
    }
}
