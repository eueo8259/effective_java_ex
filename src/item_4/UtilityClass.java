package item_4;

public class UtilityClass {
    public UtilityClass() {
        throw new AssertionError();
        //꼭 error 를 던질 필요는 없지만 클래스 안에서 실수로라도 생성자를 호출하지 않도록 막아준다.
    }

    public static int add(int a , int b){
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
