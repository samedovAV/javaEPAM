package thirdChapter.thirdChapterC.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task1.RationalFraction;
import thirdChapter.thirdChapterB.task1.RationalFractionUtils;

@Data
@AllArgsConstructor
public class LineFraction {
    private RationalFraction a;
    private RationalFraction b;
    private RationalFraction c;

    public String getInsertionPointWithX() {
        RationalFractionUtils fractionUtils = new RationalFractionUtils();
        RationalFraction temp = fractionUtils.division(c,a);
        RationalFraction xCoord = fractionUtils.negation(temp);
        return "Точка перечения с осью OX: " + "(" + xCoord.toString() + ";" + 0 + ")";
    }

    public String getInsertionPointWithY() {
        RationalFractionUtils fractionUtils = new RationalFractionUtils();
        RationalFraction temp = fractionUtils.division(c,b);
        RationalFraction yCoord = fractionUtils.negation(temp);
        return "Точка перечения с осью OY: " + "(" + yCoord.toString() + ";" + 0 + ")";
    }
}
