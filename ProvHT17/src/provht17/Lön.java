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
public class Lön {
    int[][] lön;
    public Lön(int[][] lön){
        this.lön = lön;
    }
    void sum(int[][] lön){
        double sum = 0;
        int count = 0;
        System.out.println("Månadslöner i ett It-företag");
         for (int[] w : lön) {
            for (int x : w) {
                    System.out.print(x + " ");
                sum+= x;
                count++;
                
            }
            System.out.println();
        }
         System.out.println("Medellönen: "+sum/count);
    }
}
class visa{
    public static void main(String[] args) {
        int[][] lön ={{25000,38000,45000,55000},{30000,45000,50000,60000}};
        Lön inkomster = new Lön(lön);
        inkomster.sum(lön);
    }
}