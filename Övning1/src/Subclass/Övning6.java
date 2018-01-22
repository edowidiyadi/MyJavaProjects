/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Subclass;

/**
 *
 * @author edo
 */
class I {
    public String toString(){
        return "AAAAA";
    }
}

class J extends I{
    public String toString(){
        return "BBBBB";
    }
}

class AnvandIJ{
    public static void main(String[] args) {
        I i = new I();
        System.out.println(i);
        
        J j = new J();
        System.out.println(j);
    }
}