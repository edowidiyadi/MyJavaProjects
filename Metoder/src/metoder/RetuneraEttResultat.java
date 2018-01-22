/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metoder;

/**
 *
 * @author edo
 */
public class RetuneraEttResultat {
    public static void main(String[] args) {
        int n1 = multiplicera(5,10);
        System.out.println(n1);
        int n2 = 5;
        int n3 = 10;
        int n4 = multiplicera(n2,n3);
        System.out.println(n4);
        
    }
    public static int multiplicera(int x, int y) {
        int z = x*y;
        return z;
    }
}
