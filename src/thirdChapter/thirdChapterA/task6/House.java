package thirdChapter.thirdChapterA.task6;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class House {
    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int roomsAmount;
    private String street;
    private String buildingType;
    private int lifeTime;
}
