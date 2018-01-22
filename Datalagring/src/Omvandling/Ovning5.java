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
public class Ovning5 {
    public static void main(String[] args) {
        char c1 = 'A';
        byte b1 = (byte)c1;
        int i = c1;
        
        byte b2 = 65;
        char c2 = (char)b2;
        
        System.out.println(b1+" "+i+" "+c2);
        System.out.println((int)'A');
        System.out.println((char)65);
    }
}
