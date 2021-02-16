package thirdChapter.thirdChapterA.task3;

import java.util.ArrayList;

public class AllPatients {
    /**
     * Patient: id, Фамилия, Имя, Отчество, Адрес, Телефон, Номер медицинской
     * карты, Диагноз.
     * Создать массив объектов. Вывести:
     * a) список пациентов, имеющих данный диагноз;
     * b) список пациентов, номер медицинской карты которых находится в за-
     * данном интервале.
    */
    public static void main(String[] args) {
        PatientList patientList = new PatientList();
        ArrayList<Patient> patients = patientList.createArray();

        patientList.checkDiagnosis("Воспаление", patients);
        System.out.println("\n");
        patientList.checkMedCard(13000, 15000, patients);
    }


}
