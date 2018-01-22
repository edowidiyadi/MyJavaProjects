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
class C{
    public void skrivUt(){
        System.out.println("XXXXX");
    }
}

class D extends C{
    public void skrivUt(){
        System.out.println("YYYYY");
    }
}

class E extends C{
    public void skrivUt(){
        System.out.println("ZZZZZ");
    }
}

class AnvandCDE{
    public static void main(String[] args) {
        C x1 = new C();
        C x2 = new D();
        C x3 = new E();
        
        x1.skrivUt();
        x2.skrivUt();
        x3.skrivUt();
    }
}