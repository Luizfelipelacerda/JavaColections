package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class exemplosStreamAPI {
    public static void main(String[] args) {

        //Cria uma coleção de Estudantes
        List<String> estudantes = new ArrayList<>();

        //Adiciona 4 Estudantes na coleção
//        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");
//        estudantes.add("Dio");

        //Retorna a contagem de elementos do stream
        System.out.println("contagem: "+estudantes.stream().count());

        //Retorna o elemento com maior numero de letras
        System.out.println("Maior numero de letra: "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Retorna o elemento com menor numero de letras
        System.out.println("Menor numero de letra: "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Retorna elementos que tem R no nome
        System.out.println("Com a letra R no nome: "+estudantes.stream().filter((estudante)->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Retorna elementos com 6 ou mais letras
        System.out.println("Maiores que 6: "+estudantes.stream().filter((estudante)->
                estudante.length() >= 6).collect(Collectors.toList()));

        //Retorna uma nova coleção com os nomes concatenados a quantidade de letras de cada nome
        System.out.println("nome - letras: "+estudantes.stream().map((estudante) ->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        System.out.println("-------------------------");
        //Retorna somente os 3 primeiros elementos da coleção
        System.out.println("Retorna os 3 primeiros elementos: "+estudantes.stream().limit(3).collect(Collectors.toList()));

        System.out.println("-------------------------");
        //Exibe cada elemento no console e depois retorna a coleção
        System.out.println("Retorna os elementos da coleção: "+estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("-------------------------");
        //Exibe cada elemento sem retornar a coleção.
        System.out.println("Retorna os elementos novamente:");
        estudantes.forEach(System.out::println);

        System.out.println("-------------------------");
        //exibe cada elemento multiplicado por 6
        System.out.println("Retorna os elementos multiplicados por 6:");
        estudantes.forEach((e)-> System.out.println(e.length()*6));

        System.out.println("--------------------------");
        //Retorna true se todos os elementos tiverem a letra a
        System.out.println("Todos os elementos tem a letra 'a' no nome? "+estudantes.stream().allMatch((e)-> e.toLowerCase().contains("a")));
        System.out.println("Todos os elementos tem a letra 'd' no nome? "+estudantes.stream().allMatch((e)-> e.toLowerCase().contains("d")));
        System.out.println("--------------------------");

        //Retorna true se algum dos elementos tiverem a letra z no nome
        System.out.println("Tem algum elemeno com a letra 'z' no nome? "+estudantes.stream().anyMatch((e)->e.toLowerCase().contains("z")));
        System.out.println("Tem algum elemeno com a letra 'y' no nome? "+estudantes.stream().anyMatch((e)->e.toLowerCase().contains("y")));

        System.out.println("--------------------------");
        //Retorna true se nenhum dos elementos tiver a letra k no nome
        System.out.println("Nenhum elemento tem a letra 'k' no nome? "+estudantes.stream().noneMatch((e)->e.toLowerCase().contains("k")));
        System.out.println("Nenhum elemento tem a letra 'a' no nome? "+estudantes.stream().noneMatch((e)->e.toLowerCase().contains("a")));

        System.out.println("--------------------------");
        //Retorna o primeiro elemento da coleção, caso ele exista exibe no console.
        System.out.println("Retorna o primeiro elemento da coleção");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("--------------------------");
        //Exemplo de Operação encadeada.
        System.out.println("Operação Encadeada");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudante ->
                        estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) ->
                        estudante.toLowerCase().contains("r"))
                .map((estudante) ->
                        estudante.concat(" ===== ").concat(String.valueOf(estudante.split(" ")[0].length()*4)))
                .collect(Collectors.toList())
//                .collect(Collectors.toSet())
        );

    }
}
