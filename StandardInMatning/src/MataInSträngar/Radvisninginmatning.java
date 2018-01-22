/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInSträngar;
import java.util.Scanner;

/**
 *
 * @author edo
 */
public class Radvisninginmatning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Efternamn och förnamn: ");
        String namn = in.nextLine();
        
        System.out.print("Address: ");
        String address = in.nextLine();
        
        System.out.print("Postnummer och ort: ");
        String ort = in.nextLine();
        
        System.out.println("");
        System.out.println(namn+"\n"+address+"\n"+ort);
    }
    
}
