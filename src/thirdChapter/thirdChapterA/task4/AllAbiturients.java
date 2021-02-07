package thirdChapter.thirdChapterA.task4;

public class AllAbiturients {
    public static void main(String[] args) {
        Abiturient ab1 = new Abiturient(0,"Петр","Иванович","Семенов","Сумская 14","0965423571", new int[]{1, 2, 3, 4, 3});
        Abiturient ab2 = new Abiturient(1,"Степан","Семеновович","Иванов","Сумская 56","066452351", new int[]{4, 5, 5, 4, 5});
        Abiturient ab3 = new Abiturient(2,"Иван","Иванович","Иванов","Сумская 25","099541235", new int[]{2, 3, 4, 3, 2});

        AbiturientList abiturientList = new AbiturientList();
        abiturientList.addAbiturient(ab1);
        abiturientList.addAbiturient(ab2);
        abiturientList.addAbiturient(ab3);

        abiturientList.checkBadEvaluation();
        System.out.println("\n");
        abiturientList.checkEvaluationSum(13);
        System.out.println("\n");
        abiturientList.leadingAbiturients(2);
    }
}
