package thirdChapter.thirdChapterC.task7;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task1.RationalFraction;

@Data
@AllArgsConstructor
public class PointRationalFraction {
    private RationalFraction x;
    private RationalFraction y;
    private RationalFraction z;
}
