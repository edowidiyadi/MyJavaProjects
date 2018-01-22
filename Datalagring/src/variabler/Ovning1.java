/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabler;

/**
 *
 * @author edo
 */
public class Ovning1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int antal1 = 10;
       int antal2 = antal1;
        System.out.println("antal1 = " + antal1);
        System.out.println("antal2 = " + antal2);
        
        int antalBocker;
        antalBocker = antal1 + antal2;
        System.out.println("antalet böcker = " + antalBocker);
    }
    
}
