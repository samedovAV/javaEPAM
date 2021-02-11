package thirdChapter.thirdChapterB.task2;

import java.util.ArrayList;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexActions actions = new ComplexActions();

        ArrayList<Complex> array = actions.createArray();
        actions.printArray(array);
        System.out.println();
        actions.sum(array);
        actions.multi(array);
    }
}
