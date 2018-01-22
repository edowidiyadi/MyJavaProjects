/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;
import java.util.*;

public class ShowResult {
    public static void main(String[] args) {
        List<String> namnlista = new ArrayList<>();
        namnlista.add("Annie");
        namnlista.add("Eddie");
        namnlista.add("Hasse");
        namnlista.add("Jenny");
        namnlista.add("Moody");
        namnlista.add("Ninja");
        namnlista.add("Ponny");
        List<Integer> ålderlista = Arrays.asList(20,15,30,45,32,20,23);
        show(namnlista,ålderlista);
    }
    public static void show(List<String> namnlista, List<Integer> ålderlista){
        System.out.println("Namnslista är: ");
        namnlista.forEach(
                (n)-> System.out.println(n)
        );
        Double genomsnitt = ålderlista.stream().mapToInt(n->n).average()
                .getAsDouble();
        System.out.println("Genomsnittsålder är: "+genomsnitt);   
    }
}
