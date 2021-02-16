package thirdChapter.thirdChapterA.task8;

import java.util.ArrayList;

public class CarRunner {
    /**
     * Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
     * Создать массив объектов. Вывести:
     * a) список автомобилей заданной марки;
     * b) список автомобилей заданной модели, которые эксплуатируются боль-
     * ше n лет;
     * c) список автомобилей заданного года выпуска, цена которых больше указанной.
    */
    public static void main(String[] args) {
        CarUtils carUtils = new CarUtils();
        ArrayList<Car> cars = carUtils.createCarList();

        carUtils.checkMark(cars, "BMW");
        carUtils.checkYear(cars, "MR2");
        carUtils.checkYearAndPrice(cars, 2001, 1400);
    }
}
