package fourthChapter.fourthChapterA.task5;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Planet {

    private String name;
    ArrayList<Mainland> mainlands;
    ArrayList<Ocean> oceans;

}
