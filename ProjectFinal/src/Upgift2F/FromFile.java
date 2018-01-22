/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift2F;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author woj
 */
public class FromFile {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileInputStream fin = null;
        List<Object> myObjectList = new LinkedList();

        System.out.println("Write name of the file");
        //Scanner sc = new Scanner(System.in);
        String fileName = "testdata.txt";
        // String fileName;
        //   fileName = sc.next();
        try {
            fin = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");

        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                for (String value : line.split(" ")) {
                    System.out.println(value);
                    myObjectList.add(value);

                }
                line = br.readLine();
            }
            br.close();
            
            myObjectList.add((int) myObjectList.size()/2, 2017);
        }
        System.out.println(myObjectList.toString());
    }
}
