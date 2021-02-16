package thirdChapter.thirdChapterA.task5;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;

@Data
@AllArgsConstructor
public class Book {
    private int id;
    private String name;
    private String[] author;
    private String publisher;
    private int year;
    private int pages;
    private int price;
    private String cover;

    @Override
    public String toString() {
        return "Книга --- " +
                "id=" + id +
                ", Название=" + name +
                ", Автор(ы)=" + Arrays.toString(author) +
                ", Издатель=" + publisher +
                ", Год издания=" + year +
                ", Количество страниц=" + pages +
                ", Цена=" + price +
                ", Переплет=" + cover;
    }
}
