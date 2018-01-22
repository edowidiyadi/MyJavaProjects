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
public class Ovning2 {
    public static void main(String[] args) {
        long l = 10000000000L;
        int i = (int) l;
        byte b = (byte) i;
        short s = (short) i;
        System.out.println(i+" "+b+" "+s);
        
        double d1 = 2.5;
        double d2 = 2.5E40;
        double d3 = 1.23456789012345;
        float f1 = (float) d1;
        float f2 = (float) d2;
        float f3 = (float) d3;
        System.out.println(f1+" "+f2+" "+f3);
                
                }
    
}
