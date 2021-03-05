package fourthChapter.fourthChapterA.task4;

/**
 * Создать объект класса Государство, используя классы Область, Район,
 * Город. Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
*/
public class StateMain {

    public static void main(String[] args) {
        State state = new State();

        System.out.println(state.getCapital());
        System.out.println(state.getRegions().size());
        state.showAreaCapitals();
    }
}
