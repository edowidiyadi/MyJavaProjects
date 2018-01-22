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
public class TeckenInmatning3 {
    public static void main(String[] args) throws IOException{
        System.out.print("ett tecken: ");
        char c1 = (char) System.in.read();
        
        System.out.print("ett tecken: ");
        char c2 = (char)System.in.read();
        System.out.println("tecken: "+c1+c2);
    }
}
