package thirdChapter.thirdChapterB.task6;

public class PointUtils {

    public Point createPoint() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        return new Point(a, b);
    }
}
