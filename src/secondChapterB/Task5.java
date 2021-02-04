package secondChapterB;

public class Task5 {

    public void showZerosAmount() {
        int number = 129;

        StringBuilder s = new StringBuilder();
        while(number>0) {
            if (number % 2 == 0) {
                s.insert(0, 0);
            }
            number = number / 2;
        }

        System.out.println(s.length() + "\n");
    }
}
