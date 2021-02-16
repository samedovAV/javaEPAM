package thirdChapter.thirdChapterA.task3;

import java.util.ArrayList;
import java.util.List;

public class PatientList {

    public ArrayList<Patient> createArray() {
        ArrayList<Patient> res = new ArrayList<>();
        res.add(new Patient(0,"Вова","Иванович","Петров","Пушкинская 15","0665432410",47541,"Простуда"));
        res.add(new Patient(1,"Антон","Сидорович","Беляков","Пушкинская 45","0698544210",14267,"Воспаление"));
        res.add(new Patient(2,"Коля","Иванович","Ковальов","Сумская 2","0995421302", 13341,"Простуда"));
        return res;
    }

    public void checkDiagnosis(String diagnosis, ArrayList<Patient> patients) {
        System.out.println("Пациенты имеющие диагноз " + diagnosis);
        patients.forEach(pat -> {
            if (pat.getDiagnosis().equals(diagnosis)) {
                System.out.println(pat.toString());
            }
        });
    }

    public void checkMedCard(int a, int b, ArrayList<Patient> patients) {
        patients.forEach(patient -> {
            if(patient.getMedCardNumber() >= a && patient.getMedCardNumber() <= b) {
                System.out.println(patient.toString());
            }
        });
    }
}
