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
class E {
    private int m;
    
    public E(int m){
        this.m = m;
    }
    
    public String toString(){
        return "" + m;
    }
}

class F extends E{
    private int n ;
    
    public F (int m, int n){
        super(m);
        this.n = n;
    }
    
    public String toString(){
        return super.toString()+", "+n;
    }
}

class AnvandEF{
    public static void main(String[] args) {
        E e = new E(5);
        System.out.println(e);
        
        F f = new F(3,4);
        System.out.println(f);
    }
}