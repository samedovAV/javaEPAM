package thirdChapter.thirdChapterA.task11;

import java.util.ArrayList;

public class BusRunner {
    /**
     * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута,
     * Марка, Год начала эксплуатации, Пробег.
     * Создать массив объектов. Вывести:
     * a) список автобусов для заданного номера маршрута;
     * b) список автобусов, которые эксплуатируются больше заданного срока;
     * c) список автобусов, пробег у которых больше заданного расстояния.
    */
    public static void main(String[] args) {
        BusUtils busUtils = new BusUtils();

        ArrayList<Bus> buses = busUtils.createBusList();

        busUtils.findRoute(buses);
        busUtils.checkMileage(buses);
        busUtils.checkOperatingTime(buses);
    }
}
