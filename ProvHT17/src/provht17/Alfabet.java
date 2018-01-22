/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provht17;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author edo
 */

public class Alfabet {
    char[][] alfabet;
    public Alfabet(char[][] alfabet){
        this.alfabet = alfabet;
    }
    

    void reverse(char[][] alfabet) {
        
        for (char[] w : alfabet) {
            
            for (int x = w.length-1;x>-1;x--) {
                
               
                    System.out.print(w[x]+ " ");
                }
            
            System.out.println();
        }
    }

    
    
}

class sortera{
    public static void main(String[] args) {
        char[][] alfabet = {{'A','B','C','D','E'},{'F','G','H','I','J'},
                        {'K','L','M','N','O'}};
        Alfabet alfabet1 = new Alfabet(alfabet);
        alfabet1.reverse(alfabet);
 
        
        
    }
}