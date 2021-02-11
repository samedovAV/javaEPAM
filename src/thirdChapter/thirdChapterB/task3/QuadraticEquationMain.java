package thirdChapter.thirdChapterB.task3;

import java.util.ArrayList;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        ArrayList<QuadraticEquation> equations;

        QuadraticEquationUtils equationUtils = new QuadraticEquationUtils();

        equations = equationUtils.createArray();
        equationUtils.findMaxRoots(equations);
        equationUtils.findMinRoots(equations);
    }
}
