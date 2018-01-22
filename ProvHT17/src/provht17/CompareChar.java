/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provht17;

import java.io.IOException;

/**
 *
 * @author edo
 */
public class CompareChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        System.out.print("Mata in ett tecken: ");
        char ch = (char) System.in.read();
        testChar(ch);
    }
    
    public static void testChar(char ch){
        int c = (int) ch;
        if (ch > 64 && ch < 91) {
            System.out.println(ch + " är en stor bokstav\noch har unicode: " + c);

        } else if (ch > 96 && ch < 123) {
            System.out.println(ch + " är en liten bokstav\noch har unicode: " + c);

        } else if(ch > 47 && ch < 123){
            System.out.println(ch - 48 + " är ett taltecken\noch har unicode: " + c);
            
        } else {
            System.out.println("Du mata in inte bokstav eller siffra");
        }
        
    }
    
}
