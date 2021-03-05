package fourthChapter.fourthChapterA.task1;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
*/
public class TextMain {
    public static void main(String[] args) {
        Text text = new Text();
        TextUtils textUtils = new TextUtils();

        textUtils.add(text, new Sentence());
        textUtils.printText(text);
        textUtils.printTextName(text);
    }
}
