/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author woj
 */
public class Printer {

    public static void main(String[] args) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        Runnable az = () -> {
            int i = 0;
            while (i < alphabet.length) {
                System.out.print(alphabet[i]);
                i++;
                try {
                    Thread.sleep(400);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        Runnable za = () -> {
            int i = alphabet.length - 1;
            while (i >= 0) {
                System.out.print(alphabet[i]);
                i--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };

        Thread mythread = new Thread(az);

        Thread mythreadza = new Thread(za);
        mythreadza.start();
        mythread.start();
    }
}
