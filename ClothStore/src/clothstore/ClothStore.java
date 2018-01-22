/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothstore;

import java.util.ArrayList;
abstract class Cloth {//butik samo prodava na klientu- ne kupuva od klienti

    private String color;//zatoa samo geteri imame, osven zza onSale- stavame nova cena
    private int size;
    private double price;
    private boolean onSale;//podolu go koristime vo condition

    private static int countOfCloths;//avtomatski se presmetuva podolu
    private static double totalSale;//podolu go koristime vo condition i go setirame so cenata
    //shtom se private static - ne treba vo konstruktor

    public Cloth(String color, int size, double price, boolean onSale) {
        this.color = color;//ima samo get
        this.size = size;//ima samo get
        this.price = price;//ima samo get
        this.onSale = onSale;//ima i get i set
        countOfCloths++;//ima samo get
        
        if(isOnSale()){//ako e na prodazzba - povikaj go metodot - isOnSale
            totalSale += (this.calculatePriceAfterSale());//sekoja klasa si ima svoj metod
        }else {
            totalSale += (this.getPrice());//zemi ja tekovnata cena, ima samo get, ovde se setira
        }
    }


    public static void printNumberOfCloths(){

        System.out.println("Total number of cloths are: " + Cloth.getCountOfCloths());//tolku obleka
        System.out.println("Total number of dresses are: " + Dress.getCountOfDresses());//tolku fustani
        System.out.println("Total number of pants are: " + Pants.getCountOfPants());
        System.out.println("Total number of T-shirts are: " + TShirt.getCountOfTShirts());
    }
    
    public static void printTotalSale(){

        System.out.println("Total sale of cloths are: " + Cloth.getTotalSale());
        System.out.println("Total sale of dresses are: " + Dress.getDressSale());
        System.out.println("Total sale of pants are: " + Pants.getPantsSale());
        System.out.println("Total sale of T-shirts are: " + TShirt.gettShirtSale());
    }
    public abstract double calculatePriceAfterSale();

    public abstract void printInformation();
    

    public static double getTotalSale() {
        return totalSale;
    }

    public static int getCountOfCloths(){
        return countOfCloths;
    }

    public String getColor() {
        return color;
    }
    
    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    
    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }
 }

class Dress extends Cloth{

    private static int countOfDresses;//ssamo geters 
    private static double dressSale;//ssamo geters 


    public Dress(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfDresses++;
        
        if(isOnSale()){
            dressSale += (this.calculatePriceAfterSale());//svoj metod podolu
        }else {
            dressSale += (this.getPrice());
        }
    }

    public static double getDressSale() {
        return dressSale;
    }

    public static int getCountOfDresses() {
        return countOfDresses;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .3;
    }

    @Override
    public void printInformation() {
        if(isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " dress " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 70% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " dress size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }
    }
}

class Pants extends Cloth {

    private static int countOfPants;//ssamo geters 
    private static double pantsSale;//ssamo geters 

    public Pants(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfPants++;
        
        if(isOnSale()){
            pantsSale += (this.calculatePriceAfterSale());
        }else {
            pantsSale += (this.getPrice());
        }
    }

    public static double getPantsSale() {
        return pantsSale;
    }

    public static int getCountOfPants() {
        return countOfPants;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .5;
    }

    @Override
    public void printInformation() {
        if (isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " pants " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 50% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " pants size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }

    }
}

class TShirt extends Cloth {

    private static int countOfTShirts;//ssamo geters 
    private static double tShirtSale;//ssamo geters 


    public TShirt(String color, int size, double price, boolean onSale) {
        super(color, size, price, onSale);
        countOfTShirts++;//i metod za da ni go prikaze samo brojot na koshuli
        
        if(isOnSale()){
            tShirtSale += (this.calculatePriceAfterSale());//si ima takov metod
        }else {
            tShirtSale += (this.getPrice());
        }
    }

    public static double gettShirtSale() {
        return tShirtSale;
    }

    public static int getCountOfTShirts() {
        return countOfTShirts;
    }

    @Override
    public double calculatePriceAfterSale() {
        return this.getPrice() * .7;
    }

    @Override
    public void printInformation() {
        if (isOnSale()) {
            System.out.println("The " + this.getColor() +
                    " T-shirt " + this.getSize() + " is on sale." +
                    "The original price was " + this.getPrice() +
                    " SEK, now it is 30% off. " + this.calculatePriceAfterSale() + " SEK!");
        } else {
            System.out.println("The " + this.getColor() + " T-shirt size " + this.getSize() +
                    " is not on sale and the price is "
                    + this.getPrice() + " SEK.");
        }

    }
}

enum SizeType {
    SIZE_36, SIZE_38, SIZE_40;
}

class ShopManagement {
    
    private static ArrayList<Cloth> myShop = new ArrayList<>();

    public static void main(String[] args) {
        
        int dressesForSale = 0;
        ShopManagement.initiateTheList();//metod podolu kaj shto vmetnuvame roba

        for (Cloth c : myShop){
            c.printInformation();//vo sekoja klasa go imame ovoj metod
        }
        System.out.println("-----------------------------");
        Cloth.printNumberOfCloths();//vo metodot ima i sout i get
        System.out.println("-----------------------------");
        Cloth.printTotalSale();//se shto e true boolean vo metodot, ni go dava
    }
    
    public static ArrayList<Dress> getAllDressesOnSale(){
        
    ArrayList<Dress> dressOnSale = new ArrayList<>();
    
        for (Cloth material : myShop){
            if(material instanceof Dress){
                        material.setOnSale(true);
            }
        }
        return dressOnSale;
    
    
    }

    private static void initiateTheList(){

        myShop.add(new Dress("Red", 36, 500, true));
        myShop.add(new Dress("White", 36, 400, true));
        myShop.add(new Dress("Pink", 38, 250, false));
        myShop.add(new Dress("Purple", 38, 250, true));
        myShop.add(new TShirt("Red", 38, 150, false));
        myShop.add(new TShirt("Blue", 38, 150, false));
        myShop.add(new TShirt("Yellow", 38, 150, false));
        myShop.add(new TShirt("Brown", 38, 150, true));
        myShop.add(new TShirt("Purple", 38, 150, true));
        myShop.add(new Pants("Blue", 36, 350, true));
        myShop.add(new Pants("Blue", 38, 350, false));
        myShop.add(new Pants("Black", 36, 400, true));
        myShop.add(new Pants("Black", 38, 400, false));
    }
}
