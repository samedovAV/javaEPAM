package thirdChapter.thirdChapterB.task10;

import java.util.ArrayList;

public class LineRunner {
    public static void main(String[] args) {
        LineUtils lineUtils = new LineUtils();

        ArrayList<Line> lines = lineUtils.createArray();

        lineUtils.findInsertionPoints(lines);
        lineUtils.findParallelLines(lines);
    }
}
