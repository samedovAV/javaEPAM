package thirdChapter.thirdChapterA.task2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Customer {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public static Comparator<Customer> surnameComparator = (c1, c2) -> {
        String customerSurname1 = c1.getSurname().toUpperCase();
        String customerSurname2 = c2.getSurname().toUpperCase();

        return customerSurname1.compareTo(customerSurname2);
    };
}
