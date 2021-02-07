package secondChapter.secondChapterB;

public class Task3 {

    public void checkInInterval() {
        String res;
        int[] k = {-20, 5, 6, 9, 10, 12};

        int n = 5;
        int m = 10;

        for (int num : k) {
            if ((num > n) && (num < m)) {         // (n, m)
                res = num + " is" + "(" + n + ","+ m + ")";

            } else if (num == n) {                       // [n, m), [n, m]
                res = num + " is" + "[" + n + ","+ m + "), [" + n + ","+ m + "]";

            } else if (num == m) {                       // (n, m], [n, m]
                res = num + " is" +"(" + n + ","+ m + "], [" + n + ","+ m + "]";

            } else {
                res = num + " is of outside the bounds of the ranges;";
            }
            System.out.println(res);
        }
        System.out.print("\n");
    }
}
