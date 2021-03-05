package fourthChapter.fourthChapterA.task1;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Text {

    // Заголовок
    private String name;

    // Содержание (предложения)
    private ArrayList<Sentence> sentences;
}
