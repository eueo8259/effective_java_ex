package item_6;

import java.util.regex.Pattern;

public class RomanNumerals {
    static boolean isRomanNumeralOne(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    static boolean isRomanNumeralTwo(String s){
        return ROMAN.matcher(s).matches();
    }
}
