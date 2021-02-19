package Map;

import java.util.HashMap;
import java.util.Map;

public class TesteHashMap {
    public static void main(String[] args) {
        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        campeoesMundialFifa.put("Brasil",5);
        campeoesMundialFifa.put("Alemanha",4);
        campeoesMundialFifa.put("Italia",4);
        campeoesMundialFifa.put("Uruguai",2);
        campeoesMundialFifa.put("Argentina",2);
        campeoesMundialFifa.put("França",2);
        campeoesMundialFifa.put("Inglaterra",1);
        System.out.println(campeoesMundialFifa.put("Espanha",1));
        campeoesMundialFifa.put("kkku", null);

        System.out.println(campeoesMundialFifa.get(2));

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        System.out.println(campeoesMundialFifa);

        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existir ou não um campeonato da frança
        System.out.println(campeoesMundialFifa.containsKey("França"));

        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        //Navega nos registros do Map.
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey()+" -- "+entry.getValue());
        }
        System.out.println("-------------------------");
        //Navega nos registros do Map.
        for (String key: campeoesMundialFifa.keySet()){
            System.out.println(key+" -- "+campeoesMundialFifa.get(key));
        }

    }
}
