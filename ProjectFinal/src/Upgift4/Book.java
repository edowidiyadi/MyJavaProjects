/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift4;

/**
 *
 * @author woj
 */
public class Book implements Comparable<Book>{
    String forfatare, titel, plats,forlag;
    Integer utgiven;

    /**
     *
     * @param forfatare
     * @param utgiven
     * @param titel
     * @param plats
     * @param forlag
     */
    public Book(String forfatare, Integer utgiven, String titel, String plats, String forlag) {
        this.forfatare = forfatare;
        this.utgiven =  utgiven;
        this.titel = titel;
        this.plats = plats;
        this.forlag = forlag;
    }

    public Integer getUtgiven() {
        return utgiven;
    }

    @Override
    public String toString() {
        return "Book{" + "forfatare=" + forfatare + ", titel=" + titel + ", plats=" + plats + ", forlag=" + forlag + ", utgiven=" + utgiven + '}';
    }


    @Override
    public int compareTo(Book b1) {
    final int BEFORE = -1;
    final int EQUAL = 0;
    final int AFTER = 1;

    //this optimization is usually worthwhile, and can
    //always be added
    if (this.utgiven == b1.utgiven) return EQUAL;

    //primitive numbers follow this form
    if (this.utgiven < b1.utgiven) return BEFORE;
    if (this.utgiven > b1.utgiven) return AFTER;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
