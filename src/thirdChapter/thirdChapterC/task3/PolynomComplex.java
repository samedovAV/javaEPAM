package thirdChapter.thirdChapterC.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import thirdChapter.thirdChapterB.task2.Complex;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class PolynomComplex {
    private int degree;
    private ArrayList<Complex> coefficients;
}
