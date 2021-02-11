package thirdChapter.thirdChapterA.task10;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Train {
    private String destination;

    private int trainNumber;

    private Date departureTime;

    private int coupeSeats;

    private int reservedSeats;

    private int luxSeats;

    private int commonSeats;

}
