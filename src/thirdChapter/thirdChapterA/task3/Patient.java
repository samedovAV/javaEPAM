package thirdChapter.thirdChapterA.task3;

public class Patient {
    private int id;

    private String name;

    private String surname;

    private String middleName;

    private String address;

    private String phoneNumber;

    private int medCardNumber;

    private String diagnosis;

    public Patient(int id, String name, String middleName, String surname,String address, String phoneNumber, int medCardNumber, String diagnosis) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.medCardNumber = medCardNumber;
        this.phoneNumber = phoneNumber;
        this.diagnosis = diagnosis;
    }

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setName(String name){
        this.name =name;
    }

    String getName(){
        return name;
    }

    void setSurname(String surname){
        this.surname = surname;
    }

    String getSurname(){
        return surname;
    }

    void setAddress(String address){
        this.address =address;
    }

    String getAddress(){
        return address;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedCardNumber() {
        return medCardNumber;
    }

    public void setMedCardNumber(int medCardNumber) {
        if(medCardNumber>0) {
            this.medCardNumber = medCardNumber;
        } else {
            System.out.println("Номер медицинской карты не может быть отрицательным или нулевым!");
        }
    }

    void setDiagnosis(String diagnosis){
        this.diagnosis =diagnosis;
    }

    String getDiagnosis(){
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Пациент --- " +
                "id=" + id +
                ": Фамилия='" + surname +
                "', Имя='" + name  +
                "', Отчество='" + middleName +
                "', Адрес='" + address +
                "', Номер телефона='" + phoneNumber +
                "', Номер медицинской карты='" + medCardNumber +
                "', Диагноз='" + diagnosis + "'";
    }
}
