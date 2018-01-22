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
class O {
    public final int getValue(){
        return 0;
    }
    
}

class P extends O {
    
    /*public final int getValue(){
        return 1;
    }*/
}

class Q extends O {
   
    public String toString(){
        return "YYYYY";
    }
}