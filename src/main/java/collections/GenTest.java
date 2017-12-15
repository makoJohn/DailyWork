package collections;

import java.util.function.Function;

/**
 *
 */
public class GenTest {



    public static void main(String[] args) {
        Function<Integer, String> integerStringFunction = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                return String.valueOf(integer);
            }
        };
        Function<String, Integer> doubleFunc = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s) * 2;
            }
        };

//        System.out.println(integerStringFunction.apply(5));
        System.out.println();
        Function<Integer, Integer> integerIntegerFunction = integerStringFunction.andThen(doubleFunc);
        integerIntegerFunction.apply(5);

    }
}
