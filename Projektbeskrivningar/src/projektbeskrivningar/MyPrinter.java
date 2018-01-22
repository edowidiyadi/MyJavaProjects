/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;

class Printer extends Thread {
    public void run(){
        char[] alfabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S',
        'T','U','V','W','X','Y','Z','Z','Y','X','W','V','U','T','S','R','Q','P','O','N','M','L','K',
        'J','I','H','G','F','E','D','C','B','A','A','B','C','D','E','F','G','H','I','J','K','L','M',
        'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Z','Y','X','W','V','U','T','S','R','Q',
        'P','O','N','M','L','K','J','I','H','G','F','E','D','C','B','A'};
        int tecken = 0;
        
        for (int i = 0; i < alfabet.length; i++) {
            tecken +=1;
            System.out.print(alfabet[i]+" ");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                System.out.println("");
                continue;
            }
        }
        System.out.println("\nAntal tecken: "+tecken);
    }
}
public class MyPrinter {
    public static void main(String[] args) {
        Printer alfabetet = new Printer();
        alfabetet.start();
        
        try{
            Thread.sleep(26000);
            alfabetet.interrupt();
            Thread.sleep(26000);
            alfabetet.interrupt();
            Thread.sleep(26000);
            alfabetet.interrupt();
        }catch(InterruptedException ex){
        }
    }
}
