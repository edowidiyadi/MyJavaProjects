/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift2;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author woj
 */
public class ToFile {

    public static void main(String[] args) {

        MyList single = new MyList();
        single.add(12);
        single.add(13);
        single.add(14);

        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("myFile.txt"), "utf-8"));
            writer.write(single.toString());
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
