package thirdChapter.thirdChapterC.task8;

import thirdChapter.thirdChapterB.task2.Complex;
import thirdChapter.thirdChapterB.task2.ComplexActions;

import java.util.ArrayList;

public class ComplexPointUtils {
    public void calculateDistanceToStart(ComplexPoint point) {
        ComplexActions complexActions = new ComplexActions();

        ArrayList<Complex> list = new ArrayList<>();
        list.add(powTwo(point.getX()));
        list.add(powTwo(point.getY()));
        list.add(powTwo(point.getZ()));

        Complex res = complexActions.sum(list);

    }

    public Complex powTwo(Complex num) {
        double newRe = Math.pow(num.getRe(), 2) - Math.pow(num.getIm(), 2);
        double newIm = 2 * num.getRe() * num.getIm();
        return new Complex(newRe, newIm);
    }
}
