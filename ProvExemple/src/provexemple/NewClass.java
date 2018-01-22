/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;

import java.util.Arrays;


/**
 *
 * @author edo
 */
public class NewClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] v = {{{2, 1}, {3, 5}, {6, 4}},
                        {{9, 7}, {12, 8}, {11, 10}},
                        {{16, 13}, {17, 14}, {15, 18}}};
        
        System.out.println(v.length);
        System.out.println("Före sorteringen");
        for (int[][] w :v ) {
            for (int[] x : w) {
                for (int y : x) {
                    System.out.print(y+" ");
                    
                    
                    
                }
                
            }
            System.out.println();
        }  
        System.out.println("");
        System.out.println("Efter sorteringen");
        sortering(v);
        
    }
    public static void sortering(int[][][] v){
     
        for (int[][] w :v ) {
            
            for (int[] x : w) {
                
                for (int y : x) {
                    StringBuilder antal = new StringBuilder();
                    antal.append(y).append(" ");
                    antal.sort();
                    System.out.print(antal);
                    
                    
                    
                    
                }
                
            }
            System.out.println();
        }  
            
    }  

    private static StringBuilder append(int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
