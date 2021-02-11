package thirdChapter.thirdChapterA.task10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TrainRunner {
    public static void main(String[] args) {
        TrainUtils trainUtils = new TrainUtils();
        ArrayList<Train> trains = trainUtils.createTrainList();

        // список поездов, следующих до заданного пункта назначения
        trainUtils.checkDestination(trains, "Москва");

        // список поездов, следующих до заданного пункта назначения и отправляющихся после заданного часа
        try {
            Date date = new SimpleDateFormat("yyyy.MM.dd HH:mm").parse("2021.02.02 14:00");
            trainUtils.checkDestinationAndDate(trains, "Одесса", date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // список поездов, отправляющихся до заданного пункта назначения и имеющих общие места
        trainUtils.checkDestinationAndComminSeats(trains, "Киев");
    }
}
