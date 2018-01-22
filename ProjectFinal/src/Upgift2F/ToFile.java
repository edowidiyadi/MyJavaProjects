/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift2F;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author woj
 */
public class ToFile {

    public static void main(String[] args) {

    List <Object> myObjectList = new LinkedList();
        myObjectList.add(12);
       myObjectList.add(13);
        myObjectList.add(14);

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("myFile.txt"), "utf-8"));
            
            writer.write(myObjectList.toString());
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {/*ignore*/
            }
        }
    }
}
