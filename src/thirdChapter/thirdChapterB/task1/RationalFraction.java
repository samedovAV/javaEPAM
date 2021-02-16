package thirdChapter.thirdChapterB.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RationalFraction {
    private int numerator;
    private int denominator;

    @Override
    public String toString() {
        return "{" + numerator + "/" + denominator + "}";
    }
}
