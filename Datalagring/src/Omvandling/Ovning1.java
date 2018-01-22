/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Omvandling;

/**
 *
 * @author edo
 */
public class Ovning1 {
    public static void main(String[] args) {
        byte b1 = 10;
        int i1 = b1;
        int i2 = 10;
        byte b2 = (byte) i2;
        System.out.println(i1+""+b2);
        
        float f1  = 2.5F;
        double d1 = f1;
        double d2 = 2.5;
        float f2 = (float) d2;
        float f3 = (float) 2.5;
        System.out.println(d1+""+f2);
    }
    
}
