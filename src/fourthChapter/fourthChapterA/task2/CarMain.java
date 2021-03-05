package fourthChapter.fourthChapterA.task2;

/**
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
*/
public class CarMain {

    public static void main(String[] args) {
        Car car = new Car();

        car.ride();
        car.addFuel();
        car.changeWheel(car.getWheels().get(0), new Wheel());

        System.out.println(car.getMark());
    }
}
