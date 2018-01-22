/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift3;

/**
 *
 * @author woj
 */
public class Person {

    public String fornam, eftername, personnumer;

    public Person() {
    }

    public Person(String fornam, String eftername, String personnumer) {
        this.fornam = fornam;
        this.eftername = eftername;
        this.personnumer = personnumer;
    }

    @Override
    public String toString() {
        return fornam + ","+eftername + "," + personnumer + ',';
    }

    public String getEftername() {
        return eftername;
    }

}
