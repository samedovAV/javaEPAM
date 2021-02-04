package secondChapterB;

import java.util.Scanner;

public class Task7 {
    public void convertToAnotherNumberBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        System.out.print("Input base: ");
        int base = scanner.nextInt();

        StringBuilder s = new StringBuilder();
        while(number>0) {
            s.insert(0, number % base);
            number = number / base;
        }
        System.out.println("Result: " + s);
    }
}
