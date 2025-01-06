package item_7;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakReferenceExample {
    public static void main(String[] args) {
        String strong = "Strong"; //강한 참조

        WeakReference<String> weak = new WeakReference<>(new String("Weak")); //약한 참조

        System.out.println(strong); //Strong
        System.out.println(weak.get()); //Weak

        System.gc(); // 가비지 컬렉션 강제 호출

        System.out.println(strong); //Strong
        System.out.println(weak.get()); //null
    }
}
