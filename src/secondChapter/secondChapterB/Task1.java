package secondChapter.secondChapterB;

public class Task1 {

    public void showMultiplicationChart() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.print("\n");
    }
}
