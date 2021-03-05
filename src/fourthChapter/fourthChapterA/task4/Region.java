package fourthChapter.fourthChapterA.task4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Region {

    private ArrayList<Area> areas;
    private City regionCapital;
}
