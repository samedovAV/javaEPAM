package thirdChapter.thirdChapterA.task6;

import java.util.ArrayList;

public class AllHouses {
    /**
     * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Тип
     * здания, Срок эксплуатации.
     * Создать массив объектов. Вывести:
     * a) список квартир, имеющих заданное число комнат;
     * b) список квартир, имеющих заданное число комнат и расположенных на
     * этаже, который находится в заданном промежутке;
     * c) список квартир, имеющих площадь, превосходящую заданную.
    */
    public static void main(String[] args) {
        HouseActions houseActions = new HouseActions();
        ArrayList<House> houses = houseActions.createHouseList();

        houseActions.printArray(houses);
        System.out.println("Список квартир, имеющих заданное число комнат");
        houseActions.checkRooms(houses, 3);
        houseActions.checkRoomsOnFloor(houses, 2, 3,5);
        houseActions.checkArea(houses, 44);
    }
}
