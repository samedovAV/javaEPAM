package thirdChapter.thirdChapterA.task3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Patient {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String address;
    private String phoneNumber;
    private int medCardNumber;
    private String diagnosis;
}
