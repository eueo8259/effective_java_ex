package item_3;

public class Two {
    private static final Two INSTANCE = new Two();
    private Two(){}
    public static Two getInstance(){return  INSTANCE;}
    public void leaveTheBuilding(Two two){
        if (two == INSTANCE){
            System.out.println("true");
        }
    }
}
