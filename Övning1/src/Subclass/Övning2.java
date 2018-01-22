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
class A {
    protected int m;
    
}
class B extends A {
    private int n;
    
    public B (int m, int n){
        this.m = m;
        this.n = n;
    }
    
    public String toString(){
        return m + ", " + n;
    }
}

class AnvandA{
    public static void main(String[] args) {
        B b = new B(3,4);
        System.out.println(b);
    }
}
