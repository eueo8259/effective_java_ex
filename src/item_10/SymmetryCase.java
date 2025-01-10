package item_10;

import java.util.Objects;

// SymmetryCase 클래스는 대소문자를 구분하지 않고 문자열의 동등성을 비교하려고 설계된 클래스.
public class SymmetryCase {

    // 필드: 비교 대상이 되는 문자열을 저장합니다.
    private final String s;

    // 생성자: 문자열 s를 초기화하며, null 값을 방지한다.
    public SymmetryCase(String s) {
        this.s = Objects.requireNonNull(s); // null일 경우 NullPointerException을 던진다.
    }
    @Override
    //대칭성을 위배한 경우
    public boolean equals(Object o) {
        // 첫 번째 조건: o가 SymmetryCase의 인스턴스인 경우
        if (o instanceof SymmetryCase) {
            // o를 SymmetryCase로 형변환(casting)하여 필드 s와 대소문자 구분 없이 비교
            return s.equalsIgnoreCase(((SymmetryCase) o).s);
        }

        // 두 번째 조건: o가 String의 인스턴스인 경우
        if (o instanceof String) {
            // o를 String으로 형변환(casting)하여 필드 s와 대소문자 구분 없이 비교
            return s.equalsIgnoreCase((String) o);
        }

        // 세 번째 조건: o가 SymmetryCase나 String이 아닌 경우
        return false; // 동등하지 않다고 판단
    }

//    @Override
//    //올바르게 작성된 equals
//    public boolean equals(Object o) {
//        return o instanceof SymmetryCase && ((SymmetryCase) o).s.equalsIgnoreCase(s);
//    }



    public static void main(String[] args) {
        SymmetryCase caseObj = new SymmetryCase("test");
        String strObj = "test";

        System.out.println(caseObj.equals(strObj)); // true
        System.out.println(strObj.equals(caseObj)); // false
        //대칭성 규칙을 어기게 됨
    }
}
