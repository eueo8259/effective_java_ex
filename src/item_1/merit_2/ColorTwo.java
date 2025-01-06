package item_1.merit_2;

import java.util.HashMap;
import java.util.Map;

public class ColorTwo {
    private static final Map<String, ColorTwo> MAP = new HashMap<>();
    private String color;

    private ColorTwo(String color){
        this.color = color;
    }

    public static ColorTwo instance(String color) {
        if (!MAP.containsKey(color)) {
            MAP.put(color, new ColorTwo(color));
        }

        return MAP.get(color);
    }

    public String printColor(){
        return this.color;
    }
}
