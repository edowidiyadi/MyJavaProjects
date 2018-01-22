/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift1;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author edo
 */
public class Nummer2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata in ett tecken: ");
        char tecken = (char)System.in.read();
        in.nextLine();
        System.out.print("Mata in sträng: ");
        String sträng = in.nextLine();
        StringBuilder sb = new StringBuilder(sträng + " ");
        //System.out.println("Du mata in tecken \""+tecken+"\" och sträng \""+sträng+"\"");
        //System.out.print("Nu blir det : ");
        System.out.println(sb);
        change(sb,tecken);
        System.out.println(sb);
    }
    
    public static void change(StringBuilder sträng,char tecken) {
        sträng = sträng.append(tecken);
        System.out.println(sträng);
        //System.out.println("\""+tecken+sträng+"\"");
        
    }
}
