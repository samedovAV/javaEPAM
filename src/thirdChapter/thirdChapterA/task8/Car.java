package thirdChapter.thirdChapterA.task8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private int id;

    private String mark;

    private String model;

    private int year;

    private String color;

    private int price;

    private String registrationNumber;
}
