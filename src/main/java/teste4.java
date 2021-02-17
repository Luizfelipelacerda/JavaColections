import java.util.*;

public class teste4 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<String>();

        nomes.add("juliana");
        nomes.add("pedro");
        nomes.add("carlos");
        nomes.add("larissa");
        nomes.add("joao");

        for (String nome: nomes){
            System.out.println("nome: "+nome);
        }
        System.out.println("---------------");
        nomes.set(2,"roberto");
        System.out.println("----------------------");
        System.out.println("posição 1: "+nomes.get(1));
        System.out.println("----------------------");
        nomes.remove(4);
        System.out.println(nomes);
        System.out.println("----------------------");
        nomes.remove("joao");
        System.out.println(nomes);
        System.out.println("----------------------");
        System.out.println("total: "+nomes.size());
        System.out.println("----------------------");
        System.out.println("Juliano existe na lista? "+nomes.contains("juliano"));
        System.out.println("----------------------");
        List<String> nomes2 = new ArrayList<String>();
        nomes2.add("israel");
        nomes2.add("rodrigo");

        nomes.addAll(nomes2);
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        System.out.println("estava vazia? "+ nomes.isEmpty());

    }
}
