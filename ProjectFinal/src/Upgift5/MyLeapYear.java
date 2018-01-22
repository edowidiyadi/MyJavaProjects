/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift5;

import java.util.Scanner;

/**
 *
 * @author woj
 */
public class MyLeapYear {

    public static void main(String[] args) {

        Checker checkYear = i -> {
            boolean  j = ((i% 4 == 0 & i % 100 == 0 )& i%400==0);
            return j;
        };
        Scanner sc = new Scanner(System.in);
        Integer k = sc.nextInt();
        
        System.out.println(checkYear.check(k));
    }
}
