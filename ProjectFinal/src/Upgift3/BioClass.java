/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author woj
 */
public class BioClass {

    List<BioStudent> bioList;
    int classSize = 0;

    // Sträng är fn, ef, pn, upp 

    public BioClass(String fileName) throws FileNotFoundException, IOException {
        FileInputStream fin = null;
        String[] splitStringTab;
        String splitString = "";
        try {
            fin = new FileInputStream(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");

        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            /// reading file
            while (line != null) {
                sb.append(line);

                line = br.readLine();
            }
            for (int j=0; j<sb.length();j++){
               splitString = splitString.concat(sb.toString());
            }
            splitStringTab = splitString.split(",");

            
        }
        for (int i = 0; i<splitStringTab.length;i=i+4){
            bioList= new ArrayList<>();
            bioList.add(new BioStudent(splitStringTab[i],splitStringTab[i+1],splitStringTab[i+2],splitStringTab[i+3]));
        }
         Collections.sort(bioList, (BioStudent st1, BioStudent st2) -> st1.getEftername().compareToIgnoreCase(st2.getEftername()));
    }

    /**
     *
     * @param data Sträng är fn, ef, pn, upp
     * @param vectorUppgiter
     */
    public void addStudent(String data[]) {
        bioList.add(new BioStudent(data[0], data[1], data[2], data[3]));
        Collections.sort(bioList, (BioStudent st1, BioStudent st2) -> st1.getEftername().compareToIgnoreCase(st2.getEftername()));
    }

    /*
    public void addStudent(String data[]) {
        bioList.add(new BioStudent(data));
        Collections.sort(bioList, (BioStudent st1, BioStudent st2) -> st1.getEftername().compareToIgnoreCase(st2.getEftername()));
    }*/

    public void removeStudent(String personNumer) {
        for (int i = 0; i < bioList.size(); i++) {
            if (bioList.get(i).getPersonnumer().equalsIgnoreCase(personNumer)) {
                bioList.remove(i);
            }
        }

    }

    public void toFile(String fileName) {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileName), "utf-8"));
            for (int i = 0; i < bioList.size(); i++) {
                writer.write(bioList.get(i).toString());
            }
        } catch (IOException ex) {
            // report
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {/*ignore*/
            }
        }
    }

    /**
     *
     * @return
     */
    public StringBuilder toStringBuilder() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < bioList.size(); i++) {
            output.append(bioList.get(i).toString()).append(System.lineSeparator());
        }
        return output;

    }

}
