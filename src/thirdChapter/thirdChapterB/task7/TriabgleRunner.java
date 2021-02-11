package thirdChapter.thirdChapterB.task7;

import java.util.ArrayList;

public class TriabgleRunner {
    public static void main(String[] args) {
        ArrayList<Triangle> triangles;

        TriangleUtils triangleUtils = new TriangleUtils();
        triangles = triangleUtils.createArray();

        triangleUtils.findTypeAndArea(triangles);
    }
}
