package thirdChapter.thirdChapterB.task3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class QuadraticEquationUtils {

    private QuadraticEquation createEquation() {
        double a = Math.random() * 5;
        double b = Math.random() * 100;
        double c = Math.random() * 5;

        return new QuadraticEquation(a, b, c);
    }

    public ArrayList<QuadraticEquation> createArray() {
        ArrayList<QuadraticEquation> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колиество уравнений: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createEquation());
        }

        for (QuadraticEquation q : res) {
            System.out.println(q.toString());
        }
        return res;
    }

    public void findMaxRoots(ArrayList<QuadraticEquation> list) {
        ArrayList<Double> res = new ArrayList<>();
        list.forEach(quadraticEquation -> {
            try {
                res.add(quadraticEquation.getMaxRoot());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("Максимальные корни");
        for (Double d : res) {
            System.out.println(new DecimalFormat("#0.00").format(d));
        }
    }

    public void findMinRoots(ArrayList<QuadraticEquation> list) {
        ArrayList<Double> res = new ArrayList<>();
        list.forEach(quadraticEquation -> {
            try {
                res.add(quadraticEquation.getMinRoot());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println("Минимальные корни");
        for (Double d : res) {
            System.out.println(new DecimalFormat("#0.00").format(d));
        }
    }
}
