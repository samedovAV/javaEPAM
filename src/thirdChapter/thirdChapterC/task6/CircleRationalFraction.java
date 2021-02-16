package thirdChapter.thirdChapterC.task6;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task1.RationalFraction;

@Data
@AllArgsConstructor
public class CircleRationalFraction {
    private RationalFraction centerX;
    private RationalFraction centerY;
    private double radius;
}
