package thirdChapter.thirdChapterB.task8;

import java.util.ArrayList;

public class QuadRangleRunner {
    public static void main(String[] args) {
        ArrayList<QuadRangle> quadRangles;

        QuadRangleUtils quadRangleUtils = new QuadRangleUtils();
        quadRangles = quadRangleUtils.createArray();

        quadRangleUtils.findTypeAndArea(quadRangles);
    }
}
