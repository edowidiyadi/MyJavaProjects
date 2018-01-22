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
class F {
    public int getValue(int i){
        return 0+i;
    }
}

class G extends F{
    public int getValue(int i){
        return 1+i;
    }
}

class H extends G{
    public int getValue(int i){
        return 2+i;
    }
}

class AnvandFGH{
    public static void main(String[] args) {
        F x1 = new F();
        F x2 = new G();
        F x3 = new H();
        G y = new H();
        
        int i1 = x1.getValue(10);
        int i2 = x2.getValue(10);
        int i3 = x3.getValue(10);
        int i4 = y.getValue(10);
        System.out.println(i1+" "+i2+" "+i3+" "+i4);
    }
}
