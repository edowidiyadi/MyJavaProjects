/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metoder;

/**
 *
 * @author edo
 */
public class EnMetodMedParameter {
    public static void main(String[] args) {
        System.out.println("1");
        meddelande(1);
        System.out.println("");
        System.out.println("2");
        int antal = 2;
        meddelande(antal);
        
    }
    public static void meddelande (int antal){
        for (int i = 0; i < antal; i++) {
            System.out.println("Meddelande");
            
        }
    }
    
}
