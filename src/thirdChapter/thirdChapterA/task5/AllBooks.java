package thirdChapter.thirdChapterA.task5;

import java.util.ArrayList;

public class AllBooks {
    /**
     * Book: id, Название, Автор(ы), Издательство, Год издания, Количество
     * страниц, Цена, Тип переплета.
     * Создать массив объектов. Вывести:
     * a) список книг заданного автора;
     * b) список книг, выпущенных заданным издательством;
     * c) список книг, выпущенных после заданного года.
    */
    public static void main(String[] args) {

        BookList bookList = new BookList();
        ArrayList<Book> books = bookList.createArray();

        bookList.checkAuthor("Пупкин", books);
        bookList.checkPublisher("Единорог", books);
        bookList.checkYear(1960, books);
    }
}
