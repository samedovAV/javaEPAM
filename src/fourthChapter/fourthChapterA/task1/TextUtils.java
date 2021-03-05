package fourthChapter.fourthChapterA.task1;

public class TextUtils {

    // Дополнить текст
    public void add(Text text, Sentence sentence) {
        text.getSentences().add(sentence);
    }

    // Вывести на консоль текст
    public void printText(Text text) {
        for(Sentence s : text.getSentences()) {
            System.out.print(s + ". ");
        }
    }

    // Вывести на консоль заголовок
    public void printTextName(Text text) {
        System.out.println("Заголовок текста " + text.getName());
    }
}
