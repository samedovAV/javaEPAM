package thirdChapter.thirdChapterA.task4;

import java.util.ArrayList;
import java.util.List;

public class AbiturientList {

    public ArrayList<Abiturient> createArray() {
        ArrayList<Abiturient> res = new ArrayList<>();
        res.add(new Abiturient(0,"Петр","Иванович","Семенов","Сумская 14","0965423571", new int[]{1, 2, 3, 4, 3}));
        res.add(new Abiturient(1,"Степан","Семеновович","Иванов","Сумская 56","066452351", new int[]{4, 5, 5, 4, 5}));
        res.add(new Abiturient(2,"Иван","Иванович","Иванов","Сумская 25","099541235", new int[]{2, 3, 4, 3, 2}));
        return res;
    }

    public void checkBadEvaluation(ArrayList<Abiturient> abiturients) {
        abiturients.forEach(abiturient -> {
            for(int score : abiturient.getEvaluation()) {
                if (score < 3) {
                    System.out.println(abiturient.toString());
                    break; // Может быть несколько плохих оценок - чтобы не выводило каждый раз
                }
            }
        });
    }

    public void checkEvaluationSum(int sum, ArrayList<Abiturient> abiturients) {
        abiturients.forEach(abiturient -> {
            if (abiturient.getEvaluationSum() > sum) {
                System.out.println(abiturient.toString());
            }
        });
    }

    public void leadingAbiturients(int amount, ArrayList<Abiturient> abiturients) {
        abiturients.sort(Abiturient.evaluationComparator);
        for(int i = 0; i < amount; i++) {
            System.out.println(abiturients.get(i));
        }
    }

}
