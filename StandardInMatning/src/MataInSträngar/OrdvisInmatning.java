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
public class OrdvisInmatning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Två ord i samma rad: ");
        String ord1 = in.next();
        String ord2 = in.next();
        in.nextLine();
        
        System.out.println(ord1+" "+ord2);
        //System.out.println(ord2);
        System.out.println("");
        
        System.out.println("Två ord, varje ord i sin egen rad");
        String ord3 = in.nextLine();
        String ord4 = in.nextLine();
        
        System.out.println(ord3+" "+ord4);
        //System.out.println(ord4);
        
    }
    
}
