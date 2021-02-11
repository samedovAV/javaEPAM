package thirdChapter.thirdChapterB.task9;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import thirdChapter.thirdChapterB.task6.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle {
    private Point center;
    private double radius;
    private double area;
    private double per;

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double findPer() {
        return 2 * Math.PI * radius;
    }
}


