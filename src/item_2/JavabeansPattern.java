package item_2;

public class JavabeansPattern {
    //자바빈즈 패턴
    private int servingSize = -1; //(ml, 1회 제고량) 필수; 기본값 없음
    private int servings = -1; //(회, 총 n회 제공량) 필수; 기본값 없음
    private int calories = 0; //(1회 제공량당) 선택
    private int fat = 0; //(g/1회 제공량) 선택
    private int sodium = 0; //(mg/1회 제공량) 선택
    private int carbohydrate = 0; //(g/1회 제공량) 선택

    public JavabeansPattern(){}

    public void setServingSize(int servingSize) {this.servingSize = servingSize;}
    public void setServings(int servings) {this.servings = servings;}
    public void setCalories(int calories) {this.calories = calories;}
    public void setFat(int fat) {this.fat = fat;}
    public void setSodium(int sodium) {this.sodium = sodium;}
    public void setCarbohydrate(int carbohydrate) {this.carbohydrate = carbohydrate;}
}

