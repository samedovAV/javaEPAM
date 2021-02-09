package secondChapter.secondChapterC;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");
        int n = Integer.parseInt(scanner.next());
        System.out.print("Введите число сдвига k: ");
        int k = Integer.parseInt(scanner.next());

        int matrix[][] = Task1.createMatrix(n);
        shiftRight(matrix, k);
        shiftLeft(matrix, k);
        shiftDown(matrix, k);
        shiftUp(matrix, k);
    }

    public static void shiftRight(int a[][], int k){

        for(int i=0; i<k; i++)
            for(int j=0;j<a.length; j++) {
                for (int l = a.length - 1; l > 0; l--) {
                    a[j][l] = a[j][l - 1];
                }
            }

        for(int i=0; i<k;i++){
            for(int j =0; j<a.length; j++){
                a[j][i]=0;
            }
        }

        System.out.println("Сдвигаем вправо на " + k +" :");
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }

    }  ///++++


    public static void shiftLeft(int a[][], int k){

        for(int i=0; i<k; i++)
            for(int j=0;j<a.length; j++) {
                for (int l = 0; l < a.length-1; l++) {
                    a[j][l] = a[j][l+1];
                }
            }

        for(int i=a.length-1; i>a.length-1-k;i--){
            for(int j =a.length-1; j>-1; j--){
                a[j][i]=0;
            }
        }

        System.out.println("Сдвигаем влево на " + k +" :");
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }  ///++++


    static void shiftUp(int a[][],int k){

        for(int i=0; i<k; i++)
            for(int j=0;j<a.length; j++) {
                for (int l = 0; l < a.length-1; l++) {
                    a[l][j] = a[l+1][j];
                }
            }

        for(int i=a.length-1; i>a.length-1-k;i--){
            for(int j =a.length-1; j>-1; j--){
                a[i][j]=0;
            }
        }

        System.out.println("Сдвигаем вверх на " + k +" :");
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
    }  ///++++


    static void shiftDown(int a[][],int k){

        for(int i=0; i<k; i++)
            for(int j=0;j<a.length; j++) {
                for (int l = a.length-2; l > -1; l--) {
                    a[l+1][j] = a[l][j];
                }
            }

        for(int i=0; i<k;i++){
            for(int j =0; j<a.length; j++){
                a[i][j]=0;
            }
        }

        System.out.println("Сдвигаем вниз на " + k +" :");
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a.length;j++){
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
}
}
