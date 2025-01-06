package item_2.builderPatternEx;

import java.util.Objects;

public class NyPizza extends Pizza{
    public enum Size{SMALL, MEDIUM, LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }
        @Override
        public NyPizza build(){
            return new NyPizza(this);
        }
        @Override
        protected Builder self(){
            return this;
        }
    }
    private NyPizza(Builder builder){
        super(builder); // 부모 클래스의 생성자를 호출하기 위해서 사용
        size = builder.size;
    }
}
