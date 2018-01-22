
package provexemple;

import java.util.Arrays;



public class Nummer2 {

   
    public static void main(String[] args) {
        int[][][] v = {{{2, 1, 3}, {4, 5, 6}, {7, 8, 9}},
        {{3, 2, 1}, {6, 5, 4}, {9, 8, 7}},
        {{1, 3, 2}, {4, 6, 5}, {9, 8, 7}}};
        System.out.println("Före sorteringen");
        for (int[][] w : v) {
            for (int[] x : w) {
                for (int y : x) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Efter sorteringen");
        sortering(v);
    }

    public static void sortering(int[][][] v) {

        for (int[][] w : v) {
            for (int[] x : w) {
                Arrays.sort(x);
                for (int y : x) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
    }
}
