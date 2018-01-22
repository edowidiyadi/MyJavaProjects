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
public class Ovning4 {
    public static void main(String[] args) {
        int i1 = 1234567890;
        float f1 = i1;
        double d1 = i1;
        
        float f2 = 2.5F;
        int i2 = (int)f2;
        double d2 = 2E19;
        long i = (long) d2;
        long j = 9223372036854775807L;
        System.out.println(f1+" "+d1+" "+i2+" "+i+" "+j);
                
    }
}
