/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;
import java.util.*;
import java.io.*;
/**
 *
 * @author edo
 */
class Person implements java.io.Serializable{
    private String en; //Efternamn
    private String fn; //Förnamn
    private String pnr;//Personnummer
    
    public Person(String en, String fn, String pnr) {
        this.en = en;
        this.fn = fn;
        this.pnr = pnr;
    }
    public String toString() {
        return "Namn: " + fn + " " + en + "\nPersonnummer: " + pnr;
    }
    public String getFn(){
        return fn;
    }
    public String getEn(){
        return en;
    }
    public String getPnr(){
        return pnr;
    }
}

class BioStudent extends Person {
    private String uppg;  //uppgifter
    private char betyg;
    
    public BioStudent(String fn,String en,String pnr,String uppg,char betyg) {
        super(en, fn, pnr); //en, fn, pnrString en,
        this.uppg= uppg;
        this.betyg= betyg;
    }
    public char getBetyg() {
        return betyg;
    }
    public String getUppg(){
        return uppg;
    }
    public String toString() {
        return super.toString()+"\nUppgifter: "+uppg+"\nbetyg: "+betyg+"\n";
    }
    public char setBetyg(char betyg){
        return this.betyg = betyg;
    }
    
}

class BioClass implements java.io.Serializable {
    private int antalElev;
    List<BioStudent> klass = new LinkedList<BioStudent>();
    
    public BioClass(int antalElev){   
        this.antalElev = antalElev;
    }
    public void newStudent(String fn,String en,String pnr,String uppg,char betyg){
        klass.add(new BioStudent(en,fn,pnr,uppg,betyg));   
    }
    public void oldStudent(int index){
        klass.remove(index);  
    }
    public void sortera(){
        Collections.sort(klass, new Comparator() {
            @Override
            public int compare(Object elev1, Object elev2) {
                return ((BioStudent) elev1).getFn()
                        .compareTo(((BioStudent) elev2).getFn());}
        });
    }
    public void visaKlass(){
        for (BioStudent visa : klass) {
            System.out.println(visa.toString());
        }
        System.out.println("---------------------------------");
    }
    public void bytaBetyg(String fn,char betyg){
        for (BioStudent byta : klass) {
            if(byta.getFn() == fn){
            byta.setBetyg(betyg);
            }
        }
    }
    public int getElev(){
        return antalElev;
    }
}

class MyStudent {
    public static void main(String[] args) throws FileNotFoundException, 
            IOException, ClassNotFoundException {
        BioClass klassEtt = new BioClass(3);
        
        System.out.println("Visa alla student i klassen:");
        klassEtt.newStudent("Rahmadianti","Ina","9876543210","Elev",'A');
        klassEtt.newStudent("Widiyadi","Edo","1234567890","Elev",'B');
        klassEtt.newStudent("Putri","Nadia","0192837465","Elev",'C');
        klassEtt.visaKlass();
        System.out.println("Visa alla student i klassen efter sorterad:");
        klassEtt.sortera();
        klassEtt.visaKlass();
        System.out.println("Visa alla student i klassen efter ta bort gamla elev:");
        klassEtt.oldStudent(2);
        klassEtt.visaKlass();
        System.out.println("Visa alla student i klassen efter Edo byta betyg:");
        klassEtt.bytaBetyg("Edo",'A');
        klassEtt.visaKlass();
        
        FileOutputStream filUt = new FileOutputStream("D:\\klassEtt.txt");
        ObjectOutputStream spara = new ObjectOutputStream(filUt);
        spara.writeObject(klassEtt);
        spara.close();
        FileInputStream fin = new FileInputStream("D:\\klassEtt.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        BioClass klassett = (BioClass)in.readObject();
        in.close();
    }
}
