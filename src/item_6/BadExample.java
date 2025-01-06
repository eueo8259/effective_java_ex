package item_6;

public class BadExample {
    public static void main(String[] args) {
        String s = new String("bi"); //실행될 때 마다 String 인스턴스를 새로 만든다.
        String x = "bi"; //하나의 String 인스턴스를 사용한다.
    }
}
