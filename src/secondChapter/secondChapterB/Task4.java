package secondChapter.secondChapterB;

import java.util.ArrayList;

public class Task4 {

    public void showDivByThree() {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                res.add(i);
            }
        }

        for (int num : res) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
    }
}
