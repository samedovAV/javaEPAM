package secondChapterB;

public class Task2 {

    public void printArrayInReverseOrder() {
        int[] arr = {1,42,632,3,52,53};
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
}
