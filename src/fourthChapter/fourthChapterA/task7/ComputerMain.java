package fourthChapter.fourthChapterA.task7;

/**
 * Создать объект класса Компьютер, используя классы Винчестер, Дисковод,
 * Оперативная память, Процессор. Методы: включить, выключить, проверить на вирусы,
 * вывести на консоль размер винчестера.
*/
public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.on();
        computer.off();
        computer.checkForViruses();
        computer.showWinchSize();
    }
}
