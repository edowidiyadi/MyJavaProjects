/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logik;

/**
 *
 * @author edo
 */
public class VilkorligaHandlingar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        if (m != n){
            System.out.println(m+" != " +n);
        }
        m=5;
        if (m != n ){
            System.out.println(m+" != " +n);
        }
        if (m >= 2 && m<= 7){
            System.out.println(m +" ligger melan 2 och 7");
        }
    }
    
}
