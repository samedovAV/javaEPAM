package thirdChapter.thirdChapterA.task6;

import lombok.Data;

@Data
public class House {
    private int id;

    private int apartmentNumber;

    private int area;

    private int floor;

    private int roomsAmount;

    private String street;

    private String buildingType;

    private int lifeTime;

    public House(int id, int apartmentNumber, int area,int floor, int roomsAmount, String street, String buildingType, int lifeTime) {
        this.id = id;
        this.lifeTime = lifeTime;
        this.buildingType = buildingType;
        this.street = street;
        this.roomsAmount = roomsAmount;
        this.area = area;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
    }

}
