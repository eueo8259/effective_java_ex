package item_1.disadvantage_1;

public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public static Book getName(String name){
        return new Book(name);
    }

    public String getBookName(){
        return this.name;
    }
}
