/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StandardUtMatning;

import java.util.Arrays;

/**
 *
 * @author edo
 */
public class Test {
    public static void main(String[] args) {
       char[] c = {'b', 'd', 'c', 'a', 'e'};
       sortering(c); 
       char[] d = {'g', 'z', 'x','p'};
       sortering(d);
    }
    public static void sortering(char[] c){
      Arrays.sort(c);
      for(char s : c){
        System.out.print(s+" ");
                }
        System.out.println("");
            
    }             
}

