package item_3;

public class One {
    public static final One INSTANCE = new One();

    private One(){}

    public void leaveTheBuilding(One one){
        if (one == INSTANCE){
            System.out.println("true");
        }
    }
}
