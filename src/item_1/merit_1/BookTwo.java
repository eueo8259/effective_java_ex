package item_1.merit_1;

public class BookTwo {
    private String name;
    private String author;

    public static BookTwo createBookWithName(String name){
        BookTwo book = new BookTwo();
        book.name=name;
        return book;
    }
}
