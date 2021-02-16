package thirdChapter.thirdChapterA.task4;

import java.util.ArrayList;

public class AllAbiturients {
    /**
     * Abiturient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Оценки.
     * Создать массив объектов. Вывести:
     * a) список абитуриентов, имеющих неудовлетворительные оценки;
     * b) список абитуриентов, у которых сумма баллов выше заданной;
     * c) выбрать заданное число n абитуриентов, имеющих самую высокую
     * сумму баллов (вывести также полный список абитуриентов, имеющих
     * полупроходную сумму).
    */
    public static void main(String[] args) {
        AbiturientList abiturientList = new AbiturientList();
        ArrayList<Abiturient> abiturients = abiturientList.createArray();

        abiturientList.checkBadEvaluation(abiturients);
        System.out.print("\n");
        abiturientList.checkEvaluationSum(13, abiturients);
        System.out.print("\n");
        abiturientList.leadingAbiturients(2, abiturients);
    }
}
