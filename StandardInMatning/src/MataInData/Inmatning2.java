/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MataInData;

/**
 *
 * @author edo
 */
public class Inmatning2 {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("två heltal: ");
        int tal1 = in.nextInt();
        int tal2 = in.nextInt();
        
        int sum = tal1+tal2;
        System.out.println("heltalens summa: "+sum);
    }
}
