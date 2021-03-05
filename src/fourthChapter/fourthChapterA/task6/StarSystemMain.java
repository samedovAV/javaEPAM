package fourthChapter.fourthChapterA.task6;

/**
 * Создать объект класса Звездная система, используя классы Планета,
 * Звезда, Луна. Методы: вывести на консоль количество планет в звездной
 * системе, название звезды, добавление планеты в систему.
*/
public class StarSystemMain {
    public static void main(String[] args) {

        StarSystem starSystem = new StarSystem();

        starSystem.showPlanetsAmount();
        starSystem.showStarName();
        starSystem.addPlanet(new Planet());
    }
}
