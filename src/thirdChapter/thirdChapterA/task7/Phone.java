package thirdChapter.thirdChapterA.task7;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Phone {
    private int id;

    private String name;

    private String middleName;

    private String surname;

    private String address;

    private int creditCardNumber;

    private int debit;

    private int credit;

    private int localCallsTime;

    private int distanceCallsTime;

    public static Comparator<Phone> phoneComparator = (c1, c2) -> {
        String phone1 = c1.getSurname().toUpperCase();
        String phone2 = c2.getSurname().toUpperCase();

        return phone1.compareTo(phone2);
    };
}
