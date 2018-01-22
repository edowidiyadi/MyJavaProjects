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
public class Betyg {
    public static void main(String[] args) {
        Set<String> SvenskaG = new HashSet<>();
        SvenskaG.add("710131-1234");
        SvenskaG.add("930328-3456");
        SvenskaG.add("940428-4567");
        SvenskaG.add("970715-7890");
        
        Set<String> SvenskaU = new HashSet<>();
        SvenskaU.add("820228-2345");
        SvenskaU.add("950530-5678");
        SvenskaU.add("960615-6789");
        
        Set<String> EngelskaG = new HashSet<>();
        EngelskaG.add("710131-1234");
        EngelskaG.add("820228-2345");
        EngelskaG.add("930328-3456");
        EngelskaG.add("970715-7890");
        
        Set<String> EngelskaU = new HashSet<>();
        EngelskaU.add("940428-4567");
        EngelskaU.add("950530-5678");
        EngelskaU.add("960615-6789");
        
        
        boolean eller = SvenskaG.addAll(EngelskaG);
        System.out.println("Alla elever som har fått godkända i svenska eller engelska:");
        for (Object visa : SvenskaG ) {
            System.out.println(visa);
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        
        SvenskaG.retainAll(EngelskaG);
        SvenskaG.removeAll(SvenskaU);
        System.out.println("Alla elever som har fått godkända både i svenska och engelska:");
        for (Object visa : SvenskaG ) {
            System.out.println(visa);
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        SvenskaU.retainAll(EngelskaU);
        System.out.println("Alla elever som inte har fått godkänd i någon kurs:");
        for (Object visa : SvenskaU) {
            System.out.println(visa);
        }
        
    }
}
