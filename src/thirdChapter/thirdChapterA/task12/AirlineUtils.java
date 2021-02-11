package thirdChapter.thirdChapterA.task12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AirlineUtils {

    public ArrayList<Airline> createAirlineList() {
        ArrayList<Airline> res = new ArrayList<>();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.05 12:45");
            res.add(new Airline("Токио",42, PlaneType.PASSENGER, date, DaysOfWeek.FRIDAY));
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.11 10:45");
            res.add(new Airline("Берлин",12,PlaneType.CARGO, date, DaysOfWeek.SUNDAY));
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.11 18:17");
            res.add(new Airline("Париж",29,PlaneType.PASSENGER, date, DaysOfWeek.SUNDAY));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return res;
    }

    public void checkDestination(ArrayList<Airline> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пункт назначения: ");
        String dest = sc.nextLine();

        for (Airline airline : list) {
            if (dest.equals(airline.getDestination())) {
                System.out.println(airline.toString());
            }
        }
    }

    public void checkFlightsInDay(ArrayList<Airline> list, DaysOfWeek day) {
        for (Airline airline : list) {
            if (day.equals(airline.getDay())) {
                System.out.println(airline.toString());
            }
        }
    }

    public void getFlightsDayAfterDate(ArrayList<Airline> list, DaysOfWeek day, Date date) {
        for (Airline airline : list) {
            if (day.equals(airline.getDay()) && airline.getDepartureTime().after(date)) {
                System.out.println(airline.toString());
            }
        }
    }
}
