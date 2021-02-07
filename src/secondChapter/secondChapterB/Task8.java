package secondChapter.secondChapterB;

import java.math.BigInteger;
import java.util.Scanner;

public class Task8 {
    public void convertFromNumberBaseToAnother() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        BigInteger number = new BigInteger(sc.next());
        System.out.print("Input base: ");
        int base = sc.nextInt();
        System.out.print("Input new base: ");
        int newBase = sc.nextInt();

        BigInteger b = new BigInteger(number.toString(base),newBase);
        System.out.println(b + "\n");
    }
}
