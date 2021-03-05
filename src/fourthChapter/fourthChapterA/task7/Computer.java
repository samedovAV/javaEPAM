package fourthChapter.fourthChapterA.task7;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Computer {
    private WincheaterDisk wincheaterDisk;
    private DiskDrive diskDrive;
    private ArrayList<RAM> rams;
    private CPU cpu;

    // Включить
    public void on() {}

    // Выключить
    public void off() {}

    // Проверить на вирусы
    public void checkForViruses() {}

    // Размер винчестера
    public void showWinchSize() {
        System.out.println(this.getWincheaterDisk().getSize());
    }
}
