/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;

/**
 *
 * @author edo
 */
public class Nummer3 {

    public static void main(String[] args) {
        String[][] namn = {{"Nord", "Berg"}, {"Nord", "Fred"}, {"Holm", "Fred"},
        {"Holm", "Fred"}, {"Berg", "Fred"}};

        int count = 0;
        for (int i = 0; i < namn.length; i++) {

            for (int j = 0; j < namn[i].length; j++) {

                if (namn[i][j] == "Fred") {
                    count++;
                    System.out.println(count + " " + namn[i][j]);

                }

            }

        }
        System.out.println("Antal Fred är "+count);
    }
}
