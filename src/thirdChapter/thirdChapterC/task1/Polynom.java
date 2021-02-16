package thirdChapter.thirdChapterC.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import thirdChapter.thirdChapterB.task1.RationalFraction;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Polynom {
    private int degree;
    private ArrayList<RationalFraction> coefficients;
}
