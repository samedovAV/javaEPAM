package thirdChapter.thirdChapterA.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TrainUtils {
    public ArrayList<Train> createTrainList() {
        ArrayList<Train> res = new ArrayList<>();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.05 12:45");
            res.add(new Train("Москва",5, date,24,48,8,0));
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.02 14:30");
            res.add(new Train("Одесса",10,date,48,56,18,36));
            date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.01.02 09:00");
            res.add(new Train("Киев",2,date,0,48,12,24));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return res;
    }

    public void checkDestination(ArrayList<Train> list, String destination) {
        for (Train train : list) {
            if(destination.equals(train.getDestination())) {
                System.out.println(train.toString());
            }
        }
    }

    public void checkDestinationAndDate(ArrayList<Train> list, String destination, Date date) {
        for (Train train : list) {
            if(destination.equals(train.getDestination()) && date.before(train.getDepartureTime())) {
                System.out.println(train.toString());
            }
        }
    }

    public void checkDestinationAndComminSeats(ArrayList<Train> list, String destination) {
        for (Train train : list) {
            if(destination.equals(train.getDestination()) && train.getCommonSeats() > 0) {
                System.out.println(train.toString());
            }
        }
    }
}
