/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift1F;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author woj
 */
public class MyInteger {

    public static void main(String[] args) {

        List<Integer> myIntegerList = new Vector();
        myIntegerList.add(10);
        myIntegerList.add(11);
        myIntegerList.add(12);
        System.out.println(myIntegerList.toString());
        
        myIntegerList.add(0, 15);
        System.out.println(myIntegerList.toString());
        
        int cap = myIntegerList.size();
        myIntegerList.remove(cap - 1);
        System.out.println(myIntegerList.toString());
        
        int max=myIntegerList.get(0);
        for (int i =0; i<myIntegerList.size();i++){
            if(max<myIntegerList.get(i)){
                max=myIntegerList.get(i);
            }
        }
        System.out.println(max);
    }

}
