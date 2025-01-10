package item_10;

public class ExampleOne {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2);      // false (참조 비교)

        Thread t1 = new Thread();
        Thread t2 = new Thread();

        System.out.println(t1.equals(t2)); // false (참조 비교)
        System.out.println(t1 == t2);      // false (참조 비교)
    }
}
