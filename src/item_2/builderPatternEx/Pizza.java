package item_2.builderPatternEx;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}
    final Set<Topping> toppings;

    //추상 클래스로 피자를 생성하기 위한 빌더 패턴을 구현
    abstract static class Builder<T extends Builder<T>>{
        // T extends Builder<T>는 T가 Builder<T> 타입의 하위 클래스여야 한다는 제약
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self(); //하위 클래스의 빌더 객체(this)를 반환하여 메서드 체이닝을 가능하게 한다.
        }

        abstract Pizza build();

        //하위 클래스는 이 메서드를 오버라이딩하여 자신을 반환해야 한다.
        protected abstract T self();
    }
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
        //빌더의 toppings를 복사(clone)하여 Pizza의 toppings 필드에 할당한다..
        //복사(clone)를 통해 빌더의 toppings가 외부에서 변경되어도 Pizza 객체의 불변성을 유지한다.
    }
}
