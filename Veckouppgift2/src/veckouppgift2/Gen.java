/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veckouppgift2;
import java.util.*;
/**
 *
 * @author edo
 */
interface Gen<mintyp> {
    mintyp func(mintyp n);
}


class TestGen{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mata in ett eller flera ord: ");
        String ord = in.nextLine();
        System.out.println("Mata in ett tal: ");
        int tal = in.nextInt();
        //Filosof: Rene Descartes, "Jag tänker, alltså, finns jag"
        Gen<String> ordet = (n) -> {
            return reverse(ord);
        };
        System.out.println(ordet.func(ord));
        Gen<Integer> antal = (n) -> 3;
        int talföljd = 0;
        for (int i = 0; i < tal; i++) {
            if(talföljd<tal){
            talföljd += antal.func(tal);
            System.out.print(talföljd+" ");
            }
        }
    }
    
    public static String reverse(String input){
    char[] in = input.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
        temp = in[begin];
        in[begin]=in[end];
        in[end] = temp;
        end--;
        begin++;
    }
    return new String(in);
}
}