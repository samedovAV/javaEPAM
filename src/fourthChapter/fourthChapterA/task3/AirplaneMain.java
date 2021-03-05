package fourthChapter.fourthChapterA.task3;

/**
 * Создать объект класса Самолет, используя классы Крыло, Шасси, Двигатель.
 * Методы: летать, задавать маршрут, вывести на консоль маршрут.
*/
public class AirplaneMain {

    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        airplane.fly();
        airplane.setRoute("London", "Paris");

        System.out.println("The route is: " + airplane.getStart() + " --> " + airplane.getFinish());
    }
}
