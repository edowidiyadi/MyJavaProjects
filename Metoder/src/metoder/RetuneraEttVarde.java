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
public class RetuneraEttVarde {
    public static void main(String[] args) {
        ett();
        System.out.println(ett()*5);
        
        int tal = 50*ett();
        System.out.println(tal);
    }
    
    public static int ett(){
        return 1;
    }
    
}
