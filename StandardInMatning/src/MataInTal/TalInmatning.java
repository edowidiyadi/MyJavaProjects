/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInTal;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author edo
 */
public class TalInmatning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        //in.useLocale(Locale.GERMANY);
        
        System.out.println("Två heltal i samma rad: ");
        int tal1 = in.nextInt();
        int tal2 = in.nextInt();
        in.nextLine();
        
        System.out.println("Två heltal, varje tal i sin egen rad: ");
        double tal3 = in.nextDouble();
        double tal4 = in.nextDouble();
        
        System.out.println("");
        System.out.println(tal1);
        System.out.println(tal2);
        System.out.println(tal3);
        System.out.println(tal4);
       
        
        
        
    }
    
}
