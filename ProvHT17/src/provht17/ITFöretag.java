/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provht17;
import java.util.*;

/**
 *
 * @author edo
 */
class ITFöretag {
    String jobb;
    int erfarenhet;
    int lön;
    int[][] inkom;  
   
    ITFöretag(String jobb, int erfarenhet, int lön){
        this.jobb = jobb;
        this.erfarenhet = erfarenhet;
        this.lön = lön;
        
    }
    
    
    void sum(int[][] inkom){
        double sum = 0;
        int count = 0;
        System.out.println("Månadslöner i ett It-företag");
         for (int[] w : inkom) {
            for (int x : w) {
                    System.out.print(x + " ");
                sum+= x;
                count++;
                
            }
            System.out.println();
        }
         System.out.println("Medellönen: "+sum/count);
    }
    
}

class ItFöretag{
    public static void main(String[] args) throws IOExecption {
        ITFöretag tekniker = new ITFöretag("It-tekniker",2,25000);
        ITFöretag programmerare = new ITFöretag("Programmerare",2,38000);
        ITFöretag konsult = new ITFöretag("It-konsul",2,45000);
        ITFöretag chef = new ITFöretag("It-chef",2,55000);
        ITFöretag tekniker1 = new ITFöretag("It-tekniker",3,30000);
        ITFöretag programmerare1 = new ITFöretag("Programmerare",3,45000);
        ITFöretag konsult1 = new ITFöretag("It-konsul",3,50000);
        ITFöretag chef1 = new ITFöretag("It-chef",3,60000);
        
        int[][] inkom = {{tekniker.lön,programmerare.lön,konsult.lön,chef.lön},
            {tekniker1.lön,programmerare1.lön,konsult1.lön,chef1.lön}};
        ITFöretag inkom = new ITFöretag("alla",,,inkom);
        inkom.sum(inkom);
        
    }
}
