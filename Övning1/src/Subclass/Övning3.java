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
class C {
    private int m;
    
    public int getM(){
        return m;
    }
    
    public void setM(int m){
        this.m = m;
    }
    
    
}
class D extends C{
    private int n;
    
    public D (int m, int n){
        setM(m);
        this.n = n;
    }
    
    public String toString(){
        return this.getM()+", "+n;
    }
}

class AnvandD{
    public static void main(String[] args) {
        D d = new D(3,4);
        System.out.println(d);
        
        d.setM(5);
        System.out.println(d);
        
        
    }
}

