package secondChapter.secondChapterC;

import java.util.Scanner;

public class Task1 extends TaskC {
    public void printMassiveNNWithRandomValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность: ");

        int n = (int) Math.sqrt(sc.nextInt());
        int[][] workArray = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++) {
                workArray[i][j] = random.nextInt();
                System.out.print(workArray[i][j] + " ");
            }
            System.out.println();

        }
    }

}
