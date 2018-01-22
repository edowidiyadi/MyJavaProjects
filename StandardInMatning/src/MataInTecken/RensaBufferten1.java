/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInTecken;
import java.io.IOException;
/**
 *
 * @author edo
 */
public class RensaBufferten1 {
    public static void main(String[] args) throws IOException {
        System.out.print("Mata in Tecken: ");
        char c1 = (char) System.in.read();
        System.in.read();
        //System.in.read();
        System.out.print("Mata In tecken: ");
        char c2 = (char) System.in.read();
        
        System.out.println("Tecken: "+c1+c2);
        
       
    }
}
