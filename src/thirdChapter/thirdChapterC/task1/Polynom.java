package thirdChapter.thirdChapterC.task1;

import lombok.Data;
import thirdChapter.thirdChapterB.task1.RationalFraction;

import java.util.ArrayList;

@Data
public class Polynom {
    private int degree;
    private ArrayList<RationalFraction> coefficients;

    public Polynom () {}

    public Polynom(int degree, ArrayList<RationalFraction> coefficients) {
        this.degree = degree;
        this.coefficients = coefficients;
    }
}
