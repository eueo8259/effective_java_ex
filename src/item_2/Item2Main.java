package item_2;

public class Item2Main {
    public static void main(String[] args) {
        JavabeansPattern coke = new JavabeansPattern();
        coke.setServingSize(240);
        coke.setServings(8);
        coke.setCalories(100);
        coke.setSodium(35);
        coke.setCarbohydrate(27);

        BuilderPattern soda = new BuilderPattern.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
