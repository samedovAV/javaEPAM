package thirdChapter.thirdChapterA.task8;

import java.util.ArrayList;

public class CarRunner {
    public static void main(String[] args) {
        CarUtils carUtils = new CarUtils();
        ArrayList<Car> cars = carUtils.createCarList();

        carUtils.checkMark(cars, "BMW");
        System.out.println();
        carUtils.checkYear(cars, "MR2");
        System.out.println();
        carUtils.checkYearAndPrice(cars, 2001, 1400);
    }
}
