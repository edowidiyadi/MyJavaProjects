/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author woj
 */
public class TestClass {

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList();
        bookList.add(new Book("harry", 200, "asd", "asdas", "jupiter"));
        bookList.add(new Book("harry2", 1980, "asd", "asdas", "jupiter"));
        bookList.add(new Book("harry3", 20, "asd", "asdas", "jupiter"));
     //   bookList.sort(Comparator.comparingInt(Book::getUtgiven));
       
     Collections.sort(bookList, (Book b1, Book b2)-> b1.getUtgiven().compareTo(b2.getUtgiven()));
         System.out.println(bookList.toString());
    }
}
