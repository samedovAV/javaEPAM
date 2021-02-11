package thirdChapter.thirdChapterA.task11;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bus {
    private String driver;
    private int busNumber;
    private int routeNumber;
    private String model;
    private int startYear;
    private int mileage;
}
