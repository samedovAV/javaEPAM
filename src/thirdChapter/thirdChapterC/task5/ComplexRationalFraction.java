package thirdChapter.thirdChapterC.task5;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task1.RationalFraction;

@Data
@AllArgsConstructor
public class ComplexRationalFraction {
    public RationalFraction re;
    public RationalFraction im;
}
