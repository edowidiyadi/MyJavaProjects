/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author woj
 */
public class MyInput {
    public static void main(String[] args) {
        
    
   Runnable task = ()->{
       int[] table = new int[5];
       int i =0;
       for (int j =0; j<table.length;j++){
           System.out.println(j);
           table[i]=j+j;
       }
       System.out.println(table.toString());
       };
   
   Thread mythread = new Thread(task);
   mythread.start();
   }
}
