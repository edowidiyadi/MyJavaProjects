/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;
import java.util.*;


/**
 *
 * @author edo
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean continueInput = true;
        
        do {
            try{
                //Mata in två heltal
                System.out.println("Mata in ett heltal: ");
                int number = input.nextInt();
                
                // Visa resultat 
                System.out.println("Du har matat in "+ number);
                
                continueInput = false;
            }catch (InputMismatchException ex){
                System.out.println("Försök igen! ("+"ett heltal ska matas in)");
                input.nextLine(); // rensa inmatning
            }
        }while (continueInput);
       
       
        
        
    }
}
