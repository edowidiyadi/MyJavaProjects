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
class G {
    public String toString(){
        return "AAAAA";
    }
    
}

class H extends G{
    
}

class AndvandGH{
    public static void main(String[] args) {
        G g = new G();
        System.out.println(g);
        
        H h = new H();
        System.out.println(h);
    }
}