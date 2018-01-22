/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provht17;

/**
 *
 * @author edo
 */
public class Personer {
    public static void main(String[] args) {
        String[] namn = {"Annie","Eddie","Hasse","Jenny","Moody","Ninja","Ponny"};
        int[] ålder = {20,15,30,45,32,20,23};
        show(namn,ålder);
    }
    
    public static void show(String[] namn, int[] ålder){
        for (int i = 0; i < namn.length; i++) {
            System.out.println(namn[i]+", "+ålder[i]); 
        }
        int antal = 0;
        int sum = 0;
        for (int summa : ålder) {
                    antal += 1;
                    sum += summa;
                }
        System.out.println("Medelåldern: "+sum/antal);
    }
}
