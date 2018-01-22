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
class A {
    public int getValue(){
        return 0;
    }
    
}

class B extends A {
    public int getValue(){
        return 1;
    }
}

class AnvandAB{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        
        int i1 = a1.getValue();
        int i2 = a2.getValue();
        int i3 = b.getValue();
        System.out.println(i1+" "+i2+" "+i3);
        
    }
}
