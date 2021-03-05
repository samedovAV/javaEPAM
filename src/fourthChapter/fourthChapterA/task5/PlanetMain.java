package fourthChapter.fourthChapterA.task5;

/**
 * Создать объект класса Планета, используя классы Материк, Океан,
 * Остров. Методы: вывести на консоль название материка, планеты, количество материков.
*/
public class PlanetMain {
    public static void main(String[] args) {
        Planet planet = new Planet();

        System.out.println(planet.getMainlands().get(0).getName());
        System.out.println(planet.getName());
        System.out.println(planet.getMainlands().size());
    }
}
