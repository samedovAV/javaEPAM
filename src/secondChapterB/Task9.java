package secondChapterB;

import java.util.Scanner;

public class Task9 {
    public void showMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of month: ");
        int num = sc.nextInt();

        String[] month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(num > 0 && num<month.length) {
            System.out.println(month[num]);
        }
        else {
            System.out.println("Month not found");
        }
    }
}
