package thirdChapter.thirdChapterB.task4;

import java.util.ArrayList;
import java.util.Scanner;

public class PolynomUtils {
    private Polynom createPolynom(int degree) {
        ArrayList<Integer> coefs = createCoefs(degree);
        return new Polynom(degree, coefs);
    }

    private ArrayList<Integer> createCoefs(int degree) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < degree; i++) {
            res.add((int) (Math.random() * 10));
        }
        return res;
    }

    public ArrayList<Polynom> createArray() {
        ArrayList<Polynom> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество полиномов: ");
        int m = sc.nextInt();
        System.out.print("Введите степень полинома: ");
        int degree = sc.nextInt();
        for(int i = 0; i < m; i++) {
            res.add(createPolynom(degree));
        }
        return res;
    }

    public Polynom findPolSum(ArrayList<Polynom> polynoms) {
        return new Polynom(polynoms.get(0).getDegree(), findCoefSum(polynoms));
    }

    private ArrayList<Integer> findCoefSum(ArrayList<Polynom> polynoms) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<ArrayList<Integer>> coefs = new ArrayList<>();
        int degree = polynoms.get(0).getDegree();
        for (Polynom pol : polynoms) {
            coefs.add(pol.getCoefs());
        }

        int sum = 0;
        for(int i = 0; i < degree; i++) {
            for (ArrayList<Integer> fr : coefs) {
                sum += fr.get(i);
            }
            res.add(sum);
        }

        return res;
    }
}
