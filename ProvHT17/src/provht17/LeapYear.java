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
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mata in ett år mellan 2012-2060: ");
        int year = in.nextInt();
        leapYear(year);
    }
    public static void leapYear(int year){
        if(year%4 == 0 && year%100 != 0){
            System.out.println(year+" är ett skottår (februari har 29 dagar)");
        }else {
            System.out.println(year+" är inte ett skottår");
        }
    }
}
