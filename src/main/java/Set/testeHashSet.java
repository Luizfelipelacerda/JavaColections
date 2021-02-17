package Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testeHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);
        System.out.println("---------------");
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        System.out.println("tamanho: "+notasAlunos.size());

        System.out.println("---------------");
        Iterator<Double> notasIterator = notasAlunos.iterator();
        while(notasIterator.hasNext()){
            System.out.println(notasIterator.next());
        }
        System.out.println("---------------");

        System.out.println(notasAlunos.add(44.0));
    }
}
