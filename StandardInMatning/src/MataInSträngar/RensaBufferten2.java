/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInSträngar;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author edo
 */
public class RensaBufferten2 {
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner (System.in);
        
        System.out.print("Ett tecken: ");
        char c = (char)System.in.read();
        in.nextLine();
        System.out.print("En Rad: ");
        String rad = in.nextLine();
        
        System.out.println("");
        System.out.println(c);
        System.out.println(rad);
    }
}
