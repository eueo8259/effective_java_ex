package item_7;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Objects;

public class Stack {
    private Objects [] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Objects[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Objects e){
        ensureCapacity();
        elements[size++] = e;
    }

    public Objects pop(){
        if (size == 0){
            throw new EmptyStackException();
        }
        Objects result = elements[--size];
        elements[size] = null; //다 쓴 참조 해제
        return result;
    }
    /*
    원소를 위한 공간을 적어도 하나 이상 확보한다.
    배열 크기를 늘려야 할 때마다 대략 두 배씩 늘린다.
     */
    private void ensureCapacity(){
        if (elements.length == size){
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
