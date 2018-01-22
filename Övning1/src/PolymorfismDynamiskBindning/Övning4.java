/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorfismDynamiskBindning;

/**
 *
 * @author edo
 */
class I {
    public int getValue(int i){
        return 0+i;
    }
}

class J extends I{
    public int getValue(int i){
        return 1+i;
    }
}

class K extends I{
    public int getValue(int i){
        return 2+i;
    }
}

class AnvandIJK{
    public static void main(String[] args) {
        I[] x = new I[10];
        x[0] = new I();
        x[1] = new J();
        x[2] = new I();
        x[3] = new K();
        x[4] = new J();
        x[5] = new K();
        x[6] = new I();
        x[7] = new J();
        x[8] = new I();
        x[9] = new K();
        
        int[] v = new int [x.length];
        for (int i = 0; i < x.length; i++) {
            v[i] = x[i].getValue(10);            
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+" ");
        }
        
        
        System.out.println();
    }
}
