package secondChapter.secondChapterC;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность матрицы: ");
        int n = Integer.parseInt(scanner.next());

        int matrix[][] = Task1.createMatrix(n);
        sortAscDescElements(matrix);
    }

    static void sortAscDescElements(int[][] matrix) {
        int voz=0,voz1=0,voz_i=0,voz_j=0,ub=0,ub1=0,ub_i=0,ub_j=0;

        for(int i=0; i<matrix.length; i++){              ///// Ищем возростающую последовательность
            if(i>0 && matrix[i-1][matrix.length-1]<matrix[i][0]){
                voz1++;
            }else {
                if (voz < voz1) {
                    voz = voz1;
                    voz_i=i-1;
                    voz_j=matrix.length-(voz-1);
                }
                voz1=0;
            }
            for(int j=0; j<matrix.length-1; j++)
            {
                if(matrix[i][j]<matrix[i][j+1]){
                    voz1++;
                }else {
                    if (voz < voz1) {           ///// сохраняем количество убывающих элементов
                        voz = voz1;             //// и координаты начала последовательности
                        if(j>=(voz-1)) {
                            voz_i = i;
                            voz_j = j - (voz - 1);
                        } else{
                            voz_i = i-1;
                            voz_j = (j+matrix.length) - (voz - 1);
                        }
                    }
                    voz1=0;
                }


            }
        }
        System.out.println("Наибольшее число возрастающих элементов матрицы, идущих подряд: "+voz);
        System.out.println("Начало последовательности с элемента  а["+voz_i+"]["+voz_j+"]");

        for(int i=0; i<matrix.length; i++){              ///// Ищем убывающую последовательность
            if(i>0 && matrix[i-1][matrix.length-1]>matrix[i][0]){
                ub1++;
            } else{
                if (ub < ub1) {
                    ub = ub1;
                    ub_i=i-ub;
                    ub_j=matrix.length-(ub-1);

                }
                ub1=0;;
            }
            for(int j=0; j<matrix.length-1; j++)
            {
                if(matrix[i][j]>matrix[i][j+1]){
                    ub1++;
                }else {
                    if (ub < ub1) {                 ///// сохраняем количество убывающих элементов
                        ub = ub1;                   ///// и координаты начала последовательности
                        if(j>=(ub-1)) {
                            ub_i = i;
                            ub_j = j - (ub - 1);
                        } else{
                            ub_i = i-1;
                            ub_j = (j+matrix.length) - (ub - 1);
                        }
                    }
                    ub1=0;
                }


            }
        }
        System.out.println("Наибольшее число убывающих элементов матрицы, идущих подряд: "+ub);
        System.out.println("Начало последовательности с элемента  а["+ub_i+"]["+ub_j+"]");


        System.out.println();
    }
}
