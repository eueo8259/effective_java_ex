package item_2;

public class BuilderPattern {
    //빌더 패턴
    private final int servingSize; //(ml, 1회 제고량)
    private final int servings; //(회, 총 n회 제공량)
    private final int calories; //(1회 제공량당)
    private final int fat; //(g/1회 제공량)
    private final int sodium; //(mg/1회 제공량)
    private final int carbohydrate; //(g/1회 제공량)

    public static class Builder{
        //필수 매개변수
        private final int servingSize;
        private final int servings;
        //선택 매개변수 - 기본값으로 초기화
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int val){calories = val; return this;}
        public Builder fat(int val){fat = val; return this;}
        public Builder sodium(int val){sodium = val; return this;}
        public Builder carbohydrate(int val){carbohydrate = val; return this;}

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }
    private BuilderPattern(Builder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
