package thirdChapter.thirdChapterA.task5;

public class AllBooks {
    public static void main(String[] args) {
        Book book1 = new Book(0,"Хоббит", new String[]{"Толкин"},"Единорог",1976,322,560,"Твердый переплет");
        Book book2 = new Book(1,"Книга", new String[]{"Пупкин"},"Общество Атеистов",1994,752,1260,"Твердый переплет");
        Book book3 = new Book(2,"Мифы", new String[]{"Пупкин", "Семенов"},"Единорог",1960,152,320,"Твердый переплет");

        BookList bookList = new BookList();
        bookList.addBook(book1);
        bookList.addBook(book2);
        bookList.addBook(book3);

        bookList.checkAuthor("Пупкин");
        System.out.println("\n");
        bookList.checkPublisher("Единорог");
        System.out.println("\n");
        bookList.checkYear(1960);
    }
}
