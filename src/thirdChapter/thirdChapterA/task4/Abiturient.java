package thirdChapter.thirdChapterA.task4;

import java.util.Arrays;
import java.util.Comparator;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int[] getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int[] evaluation) {
        this.evaluation = evaluation;
    }

    public int getEvaluationSum() {
        return evaluationSum;
    }

    public void setEvaluationSum(int evaluationSum) {
        if(evaluationSum>=0) {
            this.evaluationSum = evaluationSum;
        } else {
            System.out.println("Сумма оценок не может быть меньше 0!");
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
