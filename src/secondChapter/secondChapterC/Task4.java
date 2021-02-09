package secondChapter.secondChapterC;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");
        int n = Integer.parseInt(scanner.next());

        int matrix[][] = Task1.createMatrix(n);
        elementsSum(matrix);
    }

    public static void elementsSum(int[][] matrix) {
        int p1=-1,p2=-1,sum;
        boolean fl_1,fl_2;


        for(int i=0; i<matrix.length; i++){
            sum=0;
            fl_1=fl_2=false;
            for (int j=0; j<matrix.length; j++){
                if((matrix[i][j]>-1) && !fl_2 && fl_1){
                    fl_2=true;
                    p2=j;                           /// Записываем индекс второго полож. числа
                }

                if(((matrix[i][j])>-1) && !fl_1){
                    fl_1=true;
                    p1=j;                           /// Записываем индекс первого полож. числа
                }
                if(fl_1 && fl_2){
                    break;
                }
            }

            for(int j=p1+1; j<p2; j++){
                sum+=matrix[i][j];
            }

            System.out.println(p1==-1 || p2==-1 ? "В строке "+i+" нет двух положительных чисел." : "Сумма строки "+ i + " между элементами "+ matrix[i][p1] +" и "+ matrix[i][p2] +" : "+ sum );

        }

        System.out.println();
    }
}
