package item_7;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<Object, String> weakMap = new WeakHashMap<>();

        Object key1 = new Object();
        Object key2 = new Object();

        weakMap.put(key1, "Value 1");
        weakMap.put(key2, "Value 2");

        // key1에 대한 강한 참조를 제거
        key1 = null;

        System.gc();

        System.out.println("key1: " + weakMap.get(key1)); // key1: null (가비지 컬렉션에 의해 제거됨)
        System.out.println("key2: " + weakMap.get(key2)); // key2: Value 2
    }
}
