/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author edo
 */
public class Nummer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.GERMANY);
        System.out.println("Hur många artiklar du köper: ");
        int artiklar = in.nextInt();
        in.nextLine();
        System.out.println("Mata in priset av olika typer artiklar: ");
        double[] pris = new double[artiklar];
        for (int i = 0; i < artiklar; i++) {
            pris[i]= in.nextDouble();
        }
        
        in.nextLine();
        System.out.println("Mata in antalet köpta artiklar av varje typ: ");
        int[] antal = new int[artiklar];
        for (int i = 0; i < artiklar; i++) {
            antal[i]=in.nextInt();
        }
               
        
        double totalt;
        totalt = kostnad(pris,antal);
        System.out.println("Totalt pris är "+totalt+" SEK");
    }
    
    public static double kostnad(double[] pris, int[] antal) {
        double totalt = 0;
        for (int i = 0; i < antal.length; i++) {
            
        totalt += pris[i] * antal[i];
        }
        
        return totalt;
    } 
    
}
