/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift1;

import static java.lang.Math.random;
import java.util.Arrays;

/**
 *
 * @author woj
 */
public class MyVector {

    Integer vector[];

    public MyVector(int size) {
        vector = new Integer[size];
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (size * random());
        }
    }

    public void show() {
        for (int value : vector) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    /**
     *
     * @param num
     * @param place
     */
    public void change(int num, int place) {
        if (place < vector.length) {
            vector[place] = num;
        } else {
            System.out.println("Error");
        }

    }

    public int max() {
        int max = vector[0];
        for (int value : vector) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
    public void removeLast(){
       vector= Arrays.copyOf(vector, vector.length-1);
    }
}
