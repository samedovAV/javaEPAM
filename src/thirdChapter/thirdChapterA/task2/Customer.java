package thirdChapter.thirdChapterA.task2;

import java.util.Comparator;

public class Customer {
    private int id;

    private String name;

    private String surname;

    private String middleName;

    private String address;

    private int creditCardNumber;

    private int bankAccountNumber;

    public Customer(int id, String name, String middleName, String surname, String address, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        if(bankAccountNumber>0) {
            this.bankAccountNumber = bankAccountNumber;
        } else {
            System.out.println("Номер банковского счета не может быть отрицательным или нулевым!");
        }
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        if(creditCardNumber>0) {
            this.creditCardNumber = creditCardNumber;
        } else {
            System.out.println("Номер кредитной карты не может быть отрицательным или нулевым!");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Покупатель --- "+
                "id=" + id +
                ", Фамилия=" + surname +
                ", Имя=" + name  +
                ", Отчество='" + middleName +
                ", Адрес=" + address +
                ", Номер кредитной карты=" + creditCardNumber +
                ", Номер банкоского счета=" + bankAccountNumber;
    }

    public static Comparator<Customer> surnameComparator = (c1, c2) -> {
        String customerSurname1 = c1.getSurname().toUpperCase();
        String customerSurname2 = c2.getSurname().toUpperCase();

        return customerSurname1.compareTo(customerSurname2);
    };
}
