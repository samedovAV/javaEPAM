package thirdChapter.thirdChapterA.task4;

import java.util.ArrayList;
import java.util.List;

public class AbiturientList {

    private final List<Abiturient> abiturients = new ArrayList<>();

    public void addAbiturient(Abiturient a) {
        abiturients.add(a);
    }

    public void checkBadEvaluation() {
        abiturients.forEach(abiturient -> {
            for(int score : abiturient.getEvaluation()) {
                if (score < 3) {
                    System.out.println(abiturient.toString());
                    break; // Может быть несколько плохих оценок - чтобы не выводило каждый раз
                }
            }
        });
    }

    public void checkEvaluationSum(int sum) {
        abiturients.forEach(abiturient -> {
            if (abiturient.getEvaluationSum() > sum) {
                System.out.println(abiturient.toString());
            }
        });
    }

    public void leadingAbiturients(int amount) {
        abiturients.sort(Abiturient.evaluationComparator);
        for(int i = 0; i < amount; i++) {
            System.out.println(abiturients.get(i));
        }
    }

}
