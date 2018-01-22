/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift3;

import Upgift2.MyList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author woj
 */
public class Test {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      /*  FileInputStream fin = null;
        MyList loadList = new MyList();
        String allData[] = null;
        String fileName = "class.txt";
        String temp1[] = null;
        Boolean lineCheck = true;
        try {
            fin = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");

        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();

            }
            String splitString[] = sb.toString().split(",");
            for (int i = 0; i < splitString.length; i++) {
             //   System.out.println(splitString[i]);

            }
                   allData=splitString;

            br.close();
        }
        */
 String wojwoj[]={"woj", "han", "92829829"};
          BioClass myFirstClass = new BioClass("class.txt");
        System.out.println(myFirstClass.toString());
       
   

}}
