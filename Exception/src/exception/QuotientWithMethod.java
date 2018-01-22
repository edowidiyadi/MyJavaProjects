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
public class QuotientWithMethod {
    
    public static int quotient(int tal1, int tal2) {
        if (tal2 ==0){
            System.out.println("Det går inte att dela med 0");
            System.exit(1);
        }
        return tal1/tal2;
    }
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
       
       //Mata in två heltal
        System.out.println("Mata in två heltal: ");
        int tal1 = input.nextInt();
        int tal2 = input.nextInt();
        
        int result = quotient(tal1, tal2);
        System.out.println(tal1+"/"+tal2+" är "+result);
    }
    
}
