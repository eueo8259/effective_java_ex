package item_2.builderPatternEx;

import item_2.builderPatternEx.NyPizza.Size;
import item_2.builderPatternEx.Pizza.Topping;

public class PizzaMain {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(Size.SMALL).
                addTopping(Topping.SAUSAGE).
                addTopping(Topping.ONION).
                build();

        Calzone calzone = new Calzone.Builder().
                addTopping(Topping.HAM).
                sauceInside().
                build();
    }
}
