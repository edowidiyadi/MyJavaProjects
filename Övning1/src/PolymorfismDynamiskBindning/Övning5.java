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
class L {
    public int getValue(int i){
        return 0+i;
    }
}

class M extends L{
    public int getValue(int i){
        return 1+i;
    }
}

class N extends L{
    public int getValue(int i){
        return 2+i;
    }
}

class AnvandLMN{
    public static void main(String[] args) {
        L x = null;
        int t = (int) (3*Math.random());
        if (t==0)
            x = new L();
        else if (t==1)
            x = new M();
        else
            x = new N();
        
        int i = x.getValue(10);
        System.out.println(i);
            
        
    }
}