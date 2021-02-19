package Optionals;

import java.util.Optional;

public class exemploOptionalEstado {
    public static void main(String[] args) {

        System.out.println("Valor optional que esta presente");
        Optional<String> optionalString = Optional.of("Valor Presente");
//        optionalString.ifPresentOrElse((valor) -> System.out.println(valor), () -> System.out.println("Nao esta presente."));
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente."));

        System.out.println("---------------------------------------");
        System.out.println("Valor optional que não esta presente");
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente."));

        System.out.println("---------------------------------------");
        System.out.println("Empty = que não esta presente");
        Optional<String> optionalEmpty = Optional.empty();
        optionalEmpty.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente."));

        System.out.println("---------------------------------------");
        System.out.println("Valor optional que lança erro NullPointerException");
        Optional<String> optionalNullErro = Optional.of(null);
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente."));


    }
}
