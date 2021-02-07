package thirdChapter.thirdChapterA.task3;

import java.util.ArrayList;
import java.util.List;

public class PatientList {

    private final List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void checkDiagnosis(String diagnosis) {
        patients.forEach(pat -> {
            if (pat.getDiagnosis().equals(diagnosis)) {
                System.out.println(pat.toString());
            }
        });
    }

    public void checkMedCard(int a, int b) {
        patients.forEach(patient -> {
            if(patient.getMedCardNumber() >= a && patient.getMedCardNumber() <= b) {
                System.out.println(patient.toString());
            }
        });
    }
}
