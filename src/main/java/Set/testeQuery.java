package Set;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class testeQuery {
    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();
        nomes.add("juliana");
        nomes.add("pedro");
        nomes.add("carlos");
        nomes.add("larissa");
        nomes.add("joao");

        for (String nome: nomes){
            System.out.println("nome: "+nome);
        }
        System.out.println("----------------");
        System.out.println("primeiro item: "+nomes.peek());
        System.out.println(nomes);
        System.out.println("----------------");
        System.out.println("primeiro item: "+nomes.poll());
        System.out.println(nomes);
        System.out.println("----------------");
        nomes.add("daniel");
        System.out.println(nomes);
        System.out.println("----------------");
        System.out.println("tamanho da fila: "+nomes.size());
        System.out.println("carlos esta na fila? "+nomes.contains("carlos"));


    }
}
