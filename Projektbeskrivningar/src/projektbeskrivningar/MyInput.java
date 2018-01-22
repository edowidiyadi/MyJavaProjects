/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;
import java.util.*;
import java.io.*;
/**
 *
 * @author edo
 */
class InputInteger extends Thread {

    public void run() {
        System.out.println("Mata in 5 antal heltal i tråden:");
        Scanner in = new Scanner(System.in);
        List<Integer> heltal = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            heltal.add(in.nextInt());}
        System.out.println("Trådar är: ");
        heltal.forEach((n) -> System.out.print(n+" "));
        System.out.println("");
    }
}
public class MyInput {
    public static void main(String[] args) {
        InputInteger tråd1 = new InputInteger();
        tråd1.start();
        Thread tråd2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Random randomGenerator = new Random();
                List<Integer> heltal = new ArrayList<Integer>();
                for (int i = 1; i < 6; i++) {
                    heltal.add(randomGenerator.nextInt(10));}
                try{
                tråd1.sleep(10000);    
                System.out.println("Trådar 2 är: ");
                heltal.forEach((n) -> System.out.print(n + " "));
                System.out.println("");
                }catch(InterruptedException ex){}
            }
        });
        tråd2.start();
   }           
}
