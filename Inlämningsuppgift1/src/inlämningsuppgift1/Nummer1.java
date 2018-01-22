/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift1;

/**
 *
 * @author edo
 */
public class Nummer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][][] v = {{{2, 1, 3}, {4, 5, 6}, {7, 8, 9}},
        {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}},
        {{1, 3, 2}, {4, 6, 5}, {9, 8, 7}}};
        int sum = 0;
        int antalelement = 0;

        for (int[][] w : v) {

            for (int[] x : w) {
                
                for (int y : x) {
                    antalelement += 1;
                    sum += y;

                }

            }

        }
        System.out.println("Summan av alla element i vektorn v är: " + sum);
        System.out.println("Medelvärdet av alla element i vektorn v är: " + sum / antalelement);

        /*for (int i = 0; i < v.length; i++) {
          
            for (int j = 0; j < v[i].length; j++) {
                
                for (int k = 0; k < v[i][j].length; k++) {
                    
                    int sum += v[i][j][k];
                    
                }
 
            }
        
        }*/
    }

}
