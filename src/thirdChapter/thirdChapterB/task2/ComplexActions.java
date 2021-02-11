package thirdChapter.thirdChapterB.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexActions {

    public Complex createComplex() {
        double re = Math.random() * 10;
        double im = Math.random() * 10;
        return new Complex(re, im);
    }

    public ArrayList<Complex> createArray() {
        ArrayList<Complex> res = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите колиество комплексных чисел: ");
        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            res.add(createComplex());
        }
        return res;
    }

    public void printArray(ArrayList<Complex> list) {
        list.forEach(System.out::println);
    }

    public void sum(ArrayList<Complex> list) {
        double newRe = 0;
        double newIm = 0;
        for (Complex complex : list) {
            newRe += complex.getRe();
            newIm += complex.getIm();
        }
        System.out.println(new Complex(newRe, newIm).toString());
    }

    public void multi(ArrayList<Complex> list) {
        double newRe = 0;
        double newIm = 0;
        for (int i = 0; i < list.size() - 1; i+=2) {
            newRe += (list.get(i).getRe() * list.get(i+1).getRe())
                - (list.get(i).getIm() * list.get(i+1).getIm());
            newIm += (list.get(i).getRe() * list.get(i+1).getIm())
                + (list.get(i+1).getRe() * list.get(i).getIm());
        }
        System.out.println(new Complex(newRe, newIm).toString());
    }
}
