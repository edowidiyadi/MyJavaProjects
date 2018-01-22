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
public class AnropsKedja {
    public static void main(String[] args) {
        A("Här anropar man både metoderna A & B");
    }
public static void A(String s){
    System.out.println(s);
    B('B');
}
public static void B(char c){
    System.out.println(c);
}
}