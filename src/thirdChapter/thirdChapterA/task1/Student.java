package thirdChapter.thirdChapterA.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private String middleName;
    private Date dateOfBirth;
    private String surname;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;
}