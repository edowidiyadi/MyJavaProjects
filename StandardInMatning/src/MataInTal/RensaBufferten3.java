/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInTal;
import java.util.Scanner;
/**
 *
 * @author edo
 */
public class RensaBufferten3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ett heltal: ");
        int i = in.nextInt();
        
        in.nextLine();
        
        System.out.println("En rad: ");
        String rad = in.nextLine();
        
        System.out.println("");
        System.out.println(i);
        System.out.println(rad);
    }
}
