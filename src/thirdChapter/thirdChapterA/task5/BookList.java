package thirdChapter.thirdChapterA.task5;

import java.util.ArrayList;

public class BookList {
    private final ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); }

    public void checkAuthor(String author) {
        books.forEach(book -> {
            String[] authors = book.getAuthor();
            for(String a : authors) {
                if(a.equals(author)) {
                    System.out.println(book.toString());
                }
            }
        });
    }

    public void checkPublisher(String publisher) {
        books.forEach(book -> {
            if(book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        });
    }

    public void checkYear(int year) {
        books.forEach(book -> {
            if(book.getYear() > year) {
                System.out.println(book.toString());
            }
        });
    }
}
