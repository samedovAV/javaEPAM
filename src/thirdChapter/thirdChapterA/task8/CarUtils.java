package thirdChapter.thirdChapterA.task8;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class CarUtils {

    public ArrayList<Car> createCarList() {
        ArrayList<Car> res = new ArrayList<>();
        res.add(new Car(0,"BMW","X5",2005,"black",2100,"2134"));
        res.add(new Car(1,"Mazda","X2",2001,"white",1500,"1649"));
        res.add(new Car(2,"Toyota","MR2",2009,"blue",2990,"3452"));
        return res;
    }

    public void checkMark(ArrayList<Car> list, String mark) {
        for(Car car : list) {
            if (car.getMark().equals(mark)) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    public void checkYear(ArrayList<Car> list, String model) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        Scanner sc = new Scanner(System.in);
        System.out.print("Укажите количество лет: ");
        int n = sc.nextInt();

        for(Car car : list) {
            if (year - car.getYear() > n && model.equals(car.getModel())) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    public void checkYearAndPrice(ArrayList<Car> list, int year, int price) {
        for(Car car : list) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }
}
