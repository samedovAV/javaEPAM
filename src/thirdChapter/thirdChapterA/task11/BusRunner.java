package thirdChapter.thirdChapterA.task11;

import java.util.ArrayList;

public class BusRunner {

    public static void main(String[] args) {
        BusUtils busUtils = new BusUtils();

        ArrayList<Bus> buses = busUtils.createBusList();

        busUtils.findRoute(buses);
        busUtils.checkMileage(buses);
        busUtils.checkOperatingTime(buses);
    }
}
