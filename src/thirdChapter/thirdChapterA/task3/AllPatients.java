package thirdChapter.thirdChapterA.task3;

public class AllPatients {
    public static void main(String[] args) {
        Patient pat1 = new Patient(0,"Вова","Иванович","Петров","Пушкинская 15","0665432410",47541,"Простуда");
        Patient pat2 = new Patient(1,"Антон","Сидорович","Беляков","Пушкинская 45","0698544210",14267,"Воспаление");
        Patient pat3 = new Patient(2,"Коля","Иванович","Ковальов","Сумская 2","0995421302", 13341,"Простуда");

        PatientList patientList = new PatientList();
        patientList.addPatient(pat1);
        patientList.addPatient(pat2);
        patientList.addPatient(pat3);

        patientList.checkDiagnosis("Воспаление");
        System.out.println("\n");
        patientList.checkMedCard(13000, 15000);
    }


}
