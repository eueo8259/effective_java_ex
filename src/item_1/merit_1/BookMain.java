package item_1.merit_1;

public class BookMain {
    public static void main(String[] args) {
        BookOne bookOne = new BookOne("어린왕자");
        /*생성자에 넘기는 매개변수와 생성자 자체만으로는
         반환될 객체의 특성을 제대로 설명하지 못한다.*/
        BookTwo bookTwo = BookTwo.createBookWithName("어린왕자");
        // createBookWithName 이름을 가짐으로 객체의 특성을 설명할 수 있다.
    }
}
