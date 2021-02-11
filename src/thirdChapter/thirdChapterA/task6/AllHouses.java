package thirdChapter.thirdChapterA.task6;

import java.util.ArrayList;

public class AllHouses {
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
