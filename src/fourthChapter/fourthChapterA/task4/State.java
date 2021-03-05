package fourthChapter.fourthChapterA.task4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class State {

    private ArrayList<Region> regions;
    private City capital;
    private double stateArea;

    public void showAreaCapitals() {
        for(Region reg : this.getRegions()) {
            System.out.println(reg.getRegionCapital());
        }
    }
}
