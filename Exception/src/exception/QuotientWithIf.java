/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
import java.util.Scanner;

/**
 *
 * @author edo
 */
public class QuotientWithIf {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
       
       //Mata in två heltal
        System.out.println("Mata in två heltal: ");
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        
        if (tal2 != 0){
            System.out.println(tal1+"/"+tal2+" är "+(tal1/tal2));
        } else {
            System.out.println("Det går inte att dela med 0 ");
            
        }
        
    }
    
}
