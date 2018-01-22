/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author edo
 */
public class Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.GERMANY);
        System.out.println("Mata in två heltal: ");
        int a = in.nextInt();
        in.nextLine();
        int b = in.nextInt();
        int i = min(a,b);
        System.out.println("Den mindre talet är: "+i);
        
        System.out.println("Mata in två flyttal: ");
        double c = in.nextDouble();
        in.nextLine();
        double d = in.nextDouble();
        double f = min(c,d);
        System.out.println("Den mindre talet är: "+f);
        
    }
    
    public static int min(int a, int b){
        int m;
        if(a>b){
        m = b;
                }
        else {
            m = a;}
            
         return m;
    }
    public static double min(double a, double b){
        double m;
        if(a>b){
        m = b;
                }
        else {
            m = a;}
            
         return m;
    }
}
