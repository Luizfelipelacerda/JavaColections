package Optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class exemploOptionalPrimitivo {
    public static void main(String[] args) {

        System.out.println("*** Valor inteiro Optional ***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("*** Valor decimal Optional ***");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("*** Valor Long Optional ***");
        OptionalLong.of(12L).ifPresent(System.out::println);

    }
}
