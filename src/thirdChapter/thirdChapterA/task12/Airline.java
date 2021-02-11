package thirdChapter.thirdChapterA.task12;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Airline {
    private String destination;

    private int flightNumber;

    private PlaneType planeType;

    private Date departureTime;

    private DaysOfWeek day;
}

enum PlaneType {
    PASSENGER, CARGO
}

enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
