/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author woj
 */
public class BioStudent extends Person {

    private String grade;

    public BioStudent(String fornam, String eftername, String personnumer, String grade) {
        super(fornam, eftername, personnumer);
        this.grade = grade;    }
    /*
        public BioStudent(String[]data) {
        super(data[0], data[1], data[2]);
        uppgifter= new Hashtable<String, String>();
        
    }*/



    public String getFornam() {
        return fornam;
    }

    @Override
    public String getEftername() {
        return eftername;
    }

    public String getPersonnumer() {
        return personnumer;
    }
    
    

    @Override
    public String toString() {
        return (fornam + "," + eftername + "," + personnumer + "," + grade);
    }

}
