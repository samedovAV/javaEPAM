package thirdChapter.thirdChapterA.task12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AirlineRunner {
    public static void main(String[] args) {

        AirlineUtils airlineUtils = new AirlineUtils();
        ArrayList<Airline> airlines = airlineUtils.createAirlineList();

        // список рейсов для заданного пункта назначения
        airlineUtils.checkDestination(airlines);
        System.out.println();
        // список рейсов для заданного дня недели
        airlineUtils.checkFlightsInDay(airlines, DaysOfWeek.FRIDAY);
        System.out.println();

        // список рейсов для заданного дня недели, время вылета для которых больше заданного
        try {
            Date date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.11 14:00");
            airlineUtils.getFlightsDayAfterDate(airlines, DaysOfWeek.SUNDAY, date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
