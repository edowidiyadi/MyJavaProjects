/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provht17;


import java.util.Scanner;

/**
 *
 * @author edo
 */
public class MyLeapYear{
    public int year;
    public MyLeapYear(int year) {
        this.year=year;
    
}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata in ett år mellan 2012-2060: ");
        int year = in.nextInt();
        //String meddelande;
        MyLeapYear utskriv = new MyLeapYear(year);
        System.out.println(year + utskriv.leapYear(year));
    }
    public String leapYear(int year){
        String meddelande;
        if(year%4 == 0 && year%100 != 0){
            meddelande = " är ett skottår (februari har 29 dagar)";
        }else {
            meddelande = " är inte ett skottår";
        }
        return meddelande;
    }
}

