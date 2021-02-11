package thirdChapter.thirdChapterB.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.text.DecimalFormat;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getDiscriminant() {
        return Math.pow(b,2) - 4 * a * c;
    }

    public ArrayList<Double> solve() {
        double d = getDiscriminant();
        ArrayList<Double> solves = new ArrayList<>();

        if(d > 0) {
            solves.add((-b + Math.sqrt(d)) / (2 * a));
            solves.add((-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            solves.add(-b / (2 * a));
        } else {
            System.out.println("Нет корней");
        }

        return solves;
    }

    public double getExtremum() {
        return -b / (2 * a);
    }

    public double getMaxRoot() {
        ArrayList<Double> roots = solve();
        double max = roots.get(0);
        for(double root : roots) {
            if (max < root) {
                max = root;
            }
        }
        return max;
    }

    public double getMinRoot() {
        ArrayList<Double> roots = solve();
        double min = 0;
        for(double root : roots) {
            if (min > root) {
                min = root;
            }
        }
        return min;
    }

    public double[] getDecreasingInterval() {
        double[] interval = new double[2];

        if (a > 0) {
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        } else {
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        }

        return interval;
    }

    public double[] getIncreasingInterval() {
        double[] interval = new double[2];

        if (a > 0) {
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        } else {
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        }

        return interval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(new DecimalFormat("#0.00").format(a)).append("*x^2");
        if (b != 0) {
            if (b > 0) {
                sb = sb.append("+");
            }
            sb = sb.append(new DecimalFormat("#0.00").format(b)).append("*x");
        }
        if (c != 0) {
            if (c > 0) {
                sb = sb.append("+");
            }
            sb.append(new DecimalFormat("#0.00").format(c));
        }
        sb = sb.append("=0");

        return sb.toString();
    }
}
