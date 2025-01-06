package item_3;

public class Main {
    public static void main(String[] args) {
        One one = One.INSTANCE;
        One one1 = One.INSTANCE;
        one.leaveTheBuilding(one1);
        //true


        Two two = Two.getInstance();
        Two two1 = Two.getInstance();
        two.leaveTheBuilding(two1);
        //true

        Three three = Three.INSTANCE;
        Three three1 = Three.INSTANCE;
        three.leaveTheBuilding(three1);
        //true
    }
}
