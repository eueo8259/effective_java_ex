package item_3;

public enum Three {
    INSTANCE;

    public void leaveTheBuilding(Three three){
        if (three == INSTANCE){
            System.out.println("true");
        }
    }
}
