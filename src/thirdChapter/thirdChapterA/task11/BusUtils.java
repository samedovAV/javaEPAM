package thirdChapter.thirdChapterA.task11;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class BusUtils {

    public ArrayList<Bus> createBusList() {
        ArrayList<Bus> res = new ArrayList<>();
        res.add(new Bus("Петров А.С.", 651, 45, "Mercedes", 1996, 216023));
        res.add(new Bus("Семенов П.С.", 544, 12, "Mercedes", 1995, 226540));
        res.add(new Bus("Иванов Н.В.", 651, 45, "Mazda", 2003, 186234));
        return res;
    }

    public void findRoute(ArrayList<Bus> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер маршрута: ");
        int route = sc.nextInt();

        for (Bus bus : list) {
            if (bus.getRouteNumber() == route) {
                System.out.println(bus.toString());
            }
        }
    }

    public void checkOperatingTime(ArrayList<Bus> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите срок эксплуатации (в годах): ");
        int op = sc.nextInt();

        // Получаем текущий год
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        for (Bus bus : list) {
            if ((currentYear - bus.getStartYear()) > op) {
                System.out.println(bus.toString());
            }
        }
    }

    public void checkMileage(ArrayList<Bus> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите пробег: ");
        int mileAge = sc.nextInt();

        for (Bus bus : list) {
            if (bus.getMileage() > mileAge) {
                System.out.println(bus.toString());
            }
        }
    }
}
