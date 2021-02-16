package thirdChapter.thirdChapterC.task15;

import java.util.ArrayList;
import java.util.Scanner;

public class BoolVectorUtils {

    public BoolVector createBoolVector(int size) {
        ArrayList<Byte> components = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            components.add((byte) Math.round(Math.random()));
        }
        return new BoolVector(components);
    }

    public BoolVector conjunction(BoolVector a, BoolVector b) {
        ArrayList<Byte> resComponents = new ArrayList<>();
        for(int i = 0; i < a.getComponents().size(); i++) {
            resComponents.add((byte) (a.getComponents().get(i) * b.getComponents().get(i)));
        }
        return new BoolVector(resComponents);
    }

    public BoolVector disjunction(BoolVector a, BoolVector b) {
        ArrayList<Byte> resComponents = new ArrayList<>();
        for(int i = 0; i < a.getComponents().size(); i++) {
            byte frA = a.getComponents().get(i);
            byte frB = b.getComponents().get(i);

            if (frA == 1 && frB == 1) {
                resComponents.add(frA);
            } else {
                resComponents.add((byte) (frA + frB));
            }

        }
        return new BoolVector(resComponents);
    }

    public void negation(BoolVector a) {
        for (int i = 0; i < a.getComponents().size(); i++) {
            if(a.getComponents().get(i) == 1) {
                a.getComponents().set(i, (byte) 0);
            } else {
                a.getComponents().set(i, (byte) 1);
            }
        }
        System.out.println(a);
    }

    public int countZeros(BoolVector a) {
        int count = 0;
        for(byte b : a.getComponents()) {
            if(b == 0) {
                count++;
            }
        }
        return count;
    }

    public int countOnes(BoolVector a) {
        int count = 0;
        for(byte b : a.getComponents()) {
            if(b == 1) {
                count++;
            }
        }
        return count;
    }
}
