/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;

import java.util.*;

class Vector<E> extends ArrayList<E> {
}
public class MyInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv antal som ska mata in: ");
        int antal = in.nextInt();
        System.out.println("Mata in ett antal heltal i en rad: ");
        Vector<Integer> tal = new Vector<>();
        for (int i = 0; i < antal; i++) {
            tal.add(in.nextInt());
        }
        tal.add(0, 15);
        tal.remove(tal.size() - 1);
        int storsta = 0;
        System.out.println("Alla element av vectorn är: ");
        for (int visa : tal) {
            System.out.println(visa);
            if (storsta < visa) {
                storsta = visa;
            } else {
                storsta = storsta;
            }
        }
        System.out.println("och den vectorn är " + tal);
        System.out.println("Storsta heltalet är: " + storsta);
    }
}
