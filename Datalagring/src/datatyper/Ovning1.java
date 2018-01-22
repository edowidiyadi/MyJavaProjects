/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatyper;

/**
 *
 * @author edo
 */
public class Ovning1 {
    public static void main(String[] args){
        int n = 100;
        double x = 2.5000000001;
        
        double y = n*x + 100;
        System.out.println("y = " + y);
        x = 2.5E+3;
        y = x + 0.1 + 2E-2;
        System.out.println("y = " + y);
        System.out.println(0.0000001);
    }
    
}
