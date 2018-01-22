/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInSträngar;
import java.util.Scanner ;
import java.io.IOException;


/**
 *
 * @author edo
 */
public class TeckenvisInmatning {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ett fyrsiffrigt heltal: ");
        int siffra1 = System.in.read() - 48;
        int siffra2 = System.in.read() - 48;
        int siffra3 = System.in.read() - 48;
        int siffra4 = System.in.read() - 48;
        in.nextLine();
        
        int heltal = 1000*siffra1 + 100*siffra2 + 10*siffra3 + siffra4;
        
        System.out.println("Heltalst: "+ heltal);
        System.out.println("dess kvadrat: "+ heltal*heltal);
    }
    
}
