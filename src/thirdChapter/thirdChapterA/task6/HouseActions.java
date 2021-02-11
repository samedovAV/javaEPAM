package thirdChapter.thirdChapterA.task6;

import java.util.ArrayList;

public class HouseActions {
    public ArrayList<House> createHouseList() {
        ArrayList<House> res = new ArrayList<>();
        res.add(new House(0,23,45,4,2,"Сумская","Жилой дом",100));
        res.add(new House(1,13,65,5,3,"Сумская","Жилой дом",100));
        res.add(new House(2,2,36,1,1,"Пушкинская","Жилой дом",100));
        return res;
    }

    public void checkRooms(ArrayList<House> houses, int rooms){
        for (House house : houses) {
            if(house.getRoomsAmount()==rooms){
                System.out.println(house.toString());
            }
        }
        System.out.println();
    }

    public void checkRoomsOnFloor(ArrayList<House> houses, int rooms, int florMin, int florMax){
        for (House house : houses) {
            if(house.getRoomsAmount()==rooms && house.getFloor()>=florMin && house.getFloor()<=florMax){
                System.out.println(house.toString());
            }
        }
        System.out.println();
    }

    public void checkArea(ArrayList<House> houses, int area){
        for (House house : houses) {
            if (house.getArea()>area){
                System.out.println(house.toString());
            }
        }
    }

    public void printArray(ArrayList<House> list) {
        list.forEach(house -> {
            System.out.println(house.toString());
        });
        System.out.println();
    }
}
