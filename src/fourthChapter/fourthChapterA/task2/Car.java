package fourthChapter.fourthChapterA.task2;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Car {

    private ArrayList<Wheel> wheels;
    private Engine engine;
    private String mark;

    // Ехать
    public void ride() {}

    // Заправляться
    public void addFuel() {}

    // Менять колесо
    public void changeWheel(Wheel oldWheel, Wheel newWheel) {
        this.getWheels().remove(oldWheel);
        this.getWheels().add(newWheel);
    }
}
