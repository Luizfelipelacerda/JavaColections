package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class testeLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(4);

        System.out.println(sequenciaNumerica);

        sequenciaNumerica.remove(4);
        System.out.println(sequenciaNumerica);

        System.out.println("--------------");
        System.out.println(sequenciaNumerica.size());
        System.out.println("---------------");

        for (Integer seq: sequenciaNumerica){
            System.out.println(seq);
        }
        System.out.println("---------------");
        Iterator<Integer> seqIterator = sequenciaNumerica.iterator();

        while (seqIterator.hasNext()){
            System.out.println(seqIterator.next());
        }
    }
}
