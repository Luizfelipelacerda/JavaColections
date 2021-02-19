package Optionals;

import java.util.Optional;

public class exemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("valor optional");
//        Optional<String> optionalString = Optional.ofNullable(null);
//        Optional<String> optionalString = Optional.of(null);

        System.out.println("Esta Presente?: "+optionalString.isPresent());
        System.out.println("Esta vazio?: "+optionalString.isEmpty());

        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("Valor não esta presente"));

        if(optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        }

        optionalString.map((valor)-> valor.concat("***")).ifPresent(System.out::println);

        System.out.println(optionalString.orElseThrow(IllegalStateException::new));


    }
}
