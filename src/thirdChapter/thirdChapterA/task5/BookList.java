package thirdChapter.thirdChapterA.task5;

import java.util.ArrayList;

public class BookList {

    public ArrayList<Book> createArray() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(0,"Хоббит", new String[]{"Толкин"},"Единорог",1976,322,560,"Твердый переплет"));
        books.add(new Book(1,"Книга", new String[]{"Пупкин"},"Общество Атеистов",1994,752,1260,"Твердый переплет"));
        books.add(new Book(2,"Мифы", new String[]{"Пупкин", "Семенов"},"Единорог",1960,152,320,"Твердый переплет"));
        return books;
    }

    public void checkAuthor(String author, ArrayList<Book> books) {
        books.forEach(book -> {
            String[] authors = book.getAuthor();
            for(String a : authors) {
                if(a.equals(author)) {
                    System.out.println(book.toString());
                }
            }
        });
        System.out.print("\n");
    }

    public void checkPublisher(String publisher, ArrayList<Book> books) {
        books.forEach(book -> {
            if(book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        });
        System.out.print("\n");
    }

    public void checkYear(int year, ArrayList<Book> books) {
        books.forEach(book -> {
            if(book.getYear() > year) {
                System.out.println(book.toString());
            }
        });
    }
}
