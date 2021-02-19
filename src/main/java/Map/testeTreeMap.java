package Map;

import java.util.Iterator;
import java.util.TreeMap;

public class testeTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //Monta as Capitais.
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("BH", "Belo Horizonte");

        System.out.println(treeCapitais);
        System.out.println("First key: "+treeCapitais.firstKey());
        System.out.println("Last  key: "+treeCapitais.lastKey());
        System.out.println("Lower Key: "+treeCapitais.lowerKey("SC"));
        System.out.println("Higher Key:"+treeCapitais.higherKey("SC"));

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.keySet().iterator();
        System.out.println("---------------------------");
        System.out.println("Iterator");
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+" -- "+treeCapitais.get(key));
        }

        System.out.println("------------------------");
        System.out.println("for");
        for (String capital: treeCapitais.keySet()){
            System.out.println(capital+" -- "+treeCapitais.get(capital));
        }
    }
}
