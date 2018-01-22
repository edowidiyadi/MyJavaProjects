/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komplettering;

import java.util.*;

/**
 *
 * @author edo
 */
public class Lönestatistik {

    public static void main(String[] args) {
        Map<String, Integer> lön = new HashMap<>();
        lön.put("Samtliga sektorer", 41800);
        lön.put("Statlig sektor", 38600);
        lön.put("kommunal sektor", 36000);
        lön.put("Landstingssektorn", 37600);
        lön.put("Privat sektor", 42300);
        lön.put("Privatanställda tjänstemän", 42300);
        int avg = 0;
        int count = 0;
        System.out.println("Lönestatistik baserat på Sektor");
        for (Map.Entry<String, Integer> visa : lön.entrySet()) {
            System.out.format("%-32s%10d%2s", visa.getKey(), visa.getValue(), "kr");
            System.out.println("");
            avg += visa.getValue();
            count++;
        }
        System.out.println("");
        System.out.format("%-32s%10d%2s", "och genomsnittslöner är ", avg / count, "kr");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        List<Map.Entry<String, Integer>> sorteradLön = new ArrayList<Map.Entry<String, Integer>>(lön.entrySet());
        Collections.sort(sorteradLön, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        lön.clear();
        System.out.println("Lönestatistik med stigande ordning:");
        for (Map.Entry<String, Integer> sort : sorteradLön) {
            lön.put(sort.getKey(), sort.getValue());
            System.out.format("%-32s%10d%2s", sort.getKey(), sort.getValue(), "kr");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");

        System.out.println("Sektorerna som tjänar mera än 40000 kr:");
        for (Map.Entry<String, Integer> visa : sorteradLön) {
            if (visa.getValue() > 40000) {
                System.out.format("%-32s%10d%2s", visa.getKey(), visa.getValue(), "kr");
                System.out.println("");
            }

        }

    }

}
