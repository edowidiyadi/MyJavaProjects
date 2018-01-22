/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projektbeskrivningar;
import java.util.*;

/**
 *
 * @author edo
 */

interface Comparable {
    abstract int comparTo();
}
class Book implements Comparable {
    private String författare, titel, plats, förlag;
    private int utgiven;
    public Book(String författare, int utgiven, String titel, String plats, 
            String förlag) {
        this.författare = författare;
        this.utgiven = utgiven;
        this.titel = titel;
        this.plats = plats;
        this.förlag = förlag;  
    }
    public String getAuthor() {
        return författare;
    }
    public int getPublished() {
        return utgiven;
    }
    public String getTitel() {
        return titel;
    }
    public String getPlace() {
        return plats;
    }
    public String getPublisher() {
        return förlag;
    }
    public String toString(){
        return getAuthor()+". "+getPublished()+". "+getTitel()+". "+getPlace()
                +". "+getPublisher();
    }
    @Override
    public int comparTo() {
        return (författare.compareTo(författare));
    }
}
public class MyBooks {
    public static void main(String[] args) {
        List<Book> böcker = new ArrayList<>();
        böcker.add(new Book("Widiyadi, E",2017,"How to Play Badminton", "Tyresö"
                , "C3L"));
        böcker.add(new Book("Chaliawsson, S", 2010, "Dont Worry be happy"
                , "Uppsala", "Uppsala University"));
        böcker.add(new Book("Galjic, F", 2015, "Programmering 1 & 2"
                , "Stockholm", "Studentlitratur"));
        System.out.println("Böcker innan sort : ");
        for (Book visa : böcker) {

            System.out.println(visa.toString());
        }
        Collections.sort(böcker, new Comparator() {
            @Override
            public int compare(Object bok1, Object bok2) {
                return ((Book) bok1).getAuthor()
                        .compareTo(((Book) bok2).getAuthor());}
        });
        System.out.println("-------------------------------------------------");
        System.out.println("Böcker after sort : ");
        for (Book visa : böcker) {

            System.out.println(visa.toString());
        }
    }
}
