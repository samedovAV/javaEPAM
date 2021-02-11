package thirdChapter.thirdChapterB.task4;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class Polynom {
    private int degree;
    private ArrayList<Integer> coefs;
}
