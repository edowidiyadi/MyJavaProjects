/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.order;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

interface leapYear {
    public abstract String meddelande(String leap);
}

public class MyLeapYear{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata in ett år mellan 2012-2060: ");
        int year = in.nextInt();
        leapYear(year);
    }
    public static void leapYear(int year){
        String Year = Integer.toString(year);
        leapYear utskriv = (leap) ->{
        if(year%4 == 0 && year%100 != 0){
            leap = leap + " är ett skottår (februari har 29 dagar)";
        }else {
            leap = leap + " är inte ett skottår";
        }
        return leap;
                };
        System.out.println(utskriv.meddelande(Year));
    }
}



