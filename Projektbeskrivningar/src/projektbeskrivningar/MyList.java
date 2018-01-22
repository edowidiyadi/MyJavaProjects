/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;
import java.util.*;
import java.io.*;
import java.nio.file.Files;

public class MyList extends LinkedList{
   
    }
class ToFile{
    public static void main(String[] args) throws FileNotFoundException, 
            UnsupportedEncodingException, IOException {
        
        MyList listan = new MyList();
        listan.add("ett");
        listan.add("två");
        listan.add("tre");
        listan.add("fyra");
        listan.add("fem");
        listan.add("sex");
        listan.add(2000);
        listan.add(2013);
        listan.add(2010);
        
        listan.forEach(n->System.out.println(n));
        FileOutputStream filUt = new FileOutputStream("D:\\MyList.txt");
        ObjectOutputStream spara = new ObjectOutputStream(filUt);
        spara.writeObject(listan);
        spara.close();  
    }
}

class FromFile{
    public static void main(String[] args) throws IOException, 
            ClassNotFoundException {
        FileInputStream fin = new FileInputStream("D:\\MyList.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        MyList listan = (MyList) in.readObject();
        in.close();
        listan.add(listan.size()/2,2017);
        int sum = 0;
        for (Object summa : listan) {
            if(summa instanceof Integer){
                sum += (int)summa;
            }
        }
        System.out.println(sum);
        FileOutputStream filUt = new FileOutputStream("D:\\MyListSum.txt");
        ObjectOutputStream spara = new ObjectOutputStream(filUt);
        spara.writeObject(listan);
        spara.close();

    }
}
    
    

