package thirdChapter.thirdChapterA.task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
@Data
@AllArgsConstructor
public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String phoneNumber;
    private int[] evaluation;
    private int evaluationSum = 0;

    public Abiturient(int id, String name, String middleName, String surname, String address, String phoneNumber, int[] evaluation) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.evaluation = evaluation;
        for (int i : evaluation) {
            evaluationSum+=i;
        }
    }

    @Override
    public String toString() {
        return "Абитуриент ---- " +
                "id=" + id +
                ", Фамилия=" + surname+
                ", Имя=" + name  +
                ", Отчество=" + middleName  +
                ", Адрес=" + address  +
                ", Номер телефона=" + phoneNumber  +
                ", Оценки=" + Arrays.toString(evaluation) +
                ", Сумма оценок=" + evaluationSum;
    }

    public static Comparator<Abiturient> evaluationComparator = (c1, c2) -> {
        int evaluationSum1 = c1.getEvaluationSum();
        int evaluationSum2 = c2.getEvaluationSum();

        return evaluationSum2 - evaluationSum1;
    };
}
