package thirdChapter.thirdChapterC.task12;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class VectorUtils {

    public Vector createVector() {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        return new Vector(x, y);
    }

    public double findVectorModule(Vector vector) {
        return Math.sqrt(Math.pow(vector.getX(), 2) + Math.pow(vector.getY(), 2));
    }

    public double scalarProduct(Vector a, Vector b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите угол (числитель равен PI): ");
        double angle = Math.PI / sc.nextInt();
        double product = findVectorModule(a) * findVectorModule(b) * Math.cos(angle);
        System.out.println("Скалярное произведение векторов равно: " + new DecimalFormat("#0.00").format(product));
        return product;
    }

    public void add(Vector a, Vector b) {
        Vector vector = new Vector(a.getX() + b.getX(), a.getY() + b.getY());
        System.out.println("Сумма векторов равна: " + vector);
    }

    public void sub(Vector a, Vector b) {
        Vector vector = new Vector(a.getX() - b.getX(), a.getY() - b.getY());
        System.out.println("Разность векторов равна: " + vector);
    }

    public void constMultiplication(Vector a, int con) {
        Vector vector = new Vector(a.getX() * con, a.getY() * con);
        System.out.println("Умножение вектора на число " + con + ": " + vector);
    }

    public void checkVectors(Vector a, Vector b) {
        if (scalarProduct(a, b) == 0) {
            System.out.println("Векторы ортогональны");
        } else if ((a.getX() / b.getX()) == (a.getY() / b.getY())) {
            System.out.println("Векторы коллинеарны");
        }
    }
}
