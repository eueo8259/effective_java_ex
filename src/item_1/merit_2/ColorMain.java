package item_1.merit_2;

public class ColorMain {
    public static void main(String[] args) {
        ColorOne colorOne1 = new ColorOne("빨강");
        ColorOne colorOne2 = new ColorOne("빨강");
        ColorOne colorOne3 = new ColorOne("빨강");
        ColorOne colorOne4 = new ColorOne("빨강");

        System.out.println(colorOne1);
        System.out.println(colorOne2);
        System.out.println(colorOne3);
        System.out.println(colorOne4);
        //item_1.merit_2.ColorOne@2f4d3709
        //item_1.merit_2.ColorOne@4e50df2e
        //item_1.merit_2.ColorOne@1d81eb93
        //item_1.merit_2.ColorOne@7291c18f


        ColorTwo colorTwo1 = ColorTwo.instance("빨강");
        ColorTwo colorTwo2 = ColorTwo.instance("빨강");
        ColorTwo colorTwo3 = ColorTwo.instance("파랑");
        ColorTwo colorTwo4 = ColorTwo.instance("파랑");

        System.out.println(colorTwo1.printColor() + colorTwo1);
        System.out.println(colorTwo2.printColor() + colorTwo2);
        System.out.println(colorTwo3.printColor() + colorTwo3);
        System.out.println(colorTwo4.printColor() + colorTwo4);
        //빨강item_1.merit_2.ColorTwo@7cc355be
        //빨강item_1.merit_2.ColorTwo@7cc355be
        //파랑item_1.merit_2.ColorTwo@34c45dca
        //파랑item_1.merit_2.ColorTwo@34c45dca
    }
}
