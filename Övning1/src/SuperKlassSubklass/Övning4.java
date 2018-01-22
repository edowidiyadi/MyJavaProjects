/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKlassSubklass;

/**
 *
 * @author edo
 */
class A {
    public boolean equalWith (A a){
        return true;
    }
    
}

class B extends A{}

class AnvandAB{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new B();
        B b1 = new B();
        B b2 = new B();
        
        boolean c1 = a1.equalWith(a2);
        boolean c2 = a1.equalWith(a3);
        boolean c3 = a1.equalWith(b1);
        boolean c4 = b1.equalWith(a1);
        boolean c5 = b1.equalWith(b2);
        System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5+" ");
        
    }
    
}