package item_1.disadvantage_1;

public class EffectiveJava {
    private Book book;

    public EffectiveJava() {
        this.book = Book.getName("이펙티브 자바");
    }

    public String bookDetail(){
        return this.book.getBookName();
    }
}
