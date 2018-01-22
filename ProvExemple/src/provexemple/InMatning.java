/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author edo
 */
public class InMatning {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Mata in ett tecken: ");
        int a = System.in.read();
        
        if (a >64 && a< 91){
            char c = (char) a;
            System.out.println(c);
            
        } else if (a >96 && a<123){
            char c = (char) a;
            System.out.println(c);
        }else if (a >47 && a<123){
            System.out.println(a-48);
        }else {
            System.out.println("inte bokstav, inte siffra");
        }
        
    }
    
}
