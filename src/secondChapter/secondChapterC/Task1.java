package secondChapter.secondChapterC;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");

        int n = Integer.parseInt(scanner.next());

        int matrix[][] = createMatrix(n);
        sortMatrix(matrix);
    }

    static int[][] createMatrix(int n) {
        System.out.println();

        Random random = new Random();

        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = random.nextInt(n*2)-n;
            }
        }


        System.out.println("Наша матрица:");
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }

    static void sortMatrix(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length;j++)
                for(int k=0; k<matrix.length;k++)
                    if (matrix[i][j] < matrix[i][k]) {
                        int tmp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = tmp;
                    }

        }

        System.out.println("Упорядочили матрицу в порядке возростания по строкам:");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }

        System.out.println();

        //// Упорядочим по столбцам

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length;j++)
                for(int k=0; k<matrix.length;k++)
                    if (matrix[j][i] < matrix[k][i]) {
                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = tmp;
                    }

        }

        System.out.println("Упорядочили матрицу в порядке возростания по столбцам:");
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
