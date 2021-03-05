package fourthChapter.fourthChapterA.task3;

import lombok.Data;

@Data
public class Airplane {

    private Chassis chassis;
    private Engine engine;
    private Wing wing;
    private String start;
    private String finish;

    public void fly() {}

    public void setRoute(String start, String finish) {
        this.start = start;
        this.finish = finish;
    }
}
