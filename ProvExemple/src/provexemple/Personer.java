/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provexemple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edo
 */
public class Personer {
    String namn;
    public Personer(String namnm){
        this.namn = namnm;
    }

    
    public void visa(){
        System.out.println(namn);
    }
}

class TestPersoner{
    public static void main(String[] args) {
        Personer person1 = new Personer("Linda");
        Personer person2 = new Personer("Sofia");
        Personer person3 = new Personer("Jonas");
        Personer person4 = new Personer("Häkan");
        Personer person5 = new Personer("Malin");
        String[] person = {person1.namn, person2.namn, person3.namn, 
            person4.namn, person5.namn};
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
            
        }
        /*System.out.println("");
        person1.visa();
        person2.visa();
        person3.visa();
        person4.visa();
        person5.visa();
        */
    }
}