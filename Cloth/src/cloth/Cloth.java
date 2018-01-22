/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloth;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author edo
 */
class Cloth {
    public String type;
    public String color;
    public String size;
    public int price;
    public boolean sale;
    public static int countOfClothes;
    public static int countOfDress;
    public static int countOfTshirt;
    public static int countOfPants;
    public static double totalSales;
    public static double priceSale;
    
    public Cloth(String type, String color, String size, int price, boolean sale){
        this.type = type;
        this.color = color;
        this.size = size;
        this.price = price;
        this.sale = sale;
        countOfClothes++;
        
    }
    public static void printNumberOfCloths(){

        System.out.println("Total number of cloths are: " + Cloth.countOfClothes);
        System.out.println("Total number of dresses are: " + Dress.countOfDress);
        System.out.println("Total number of pants are: " + Pants.countOfPants);
        System.out.println("Total number of T-shirts are: " + TShirt.countOfTshirt);
    }
    
    public void printInformation(){
        
    }
    
    public static void printTotalSale(){
        totalSales = Dress.totalSales()+Pants.totalSales()+TShirt.totalSales();
        System.out.println("Total sale of cloths are: " + Cloth.totalSales());
        System.out.println("Total sale of dresses are: " + Dress.totalSales());
        System.out.println("Total sale of pants are: " + Pants.totalSales());
        System.out.println("Total sale of T-shirts are: " + TShirt.totalSales());
        
    }
    
    public static double totalSales(){
        return totalSales;
    }
    

}

class Dress extends Cloth{
    public static double dressSales;
   
    public Dress(String type, String color, String size, int price, boolean sale){
        super(type,color,size,price,sale);
        countOfDress++;
        if(sale){
            priceSale = 0.3*price;
            dressSales += priceSale;
        }
        else {
            dressSales += price;
        }
    }
    
    public static double totalSales(){
        return dressSales;
    }
    
    @Override
    public void printInformation(){
       
        if(sale){
            System.out.println("The "+color+" "+type+" size "+size
                    +" is on sale. The original price was "+price+" SEK, now it is 70% off. "
            +(int)priceSale+" SEK");
        }
        
        else{
            System.out.println("The "+color+" "+type+" size "+size
                    +" is not on sale and the price is "+price+" SEK.");
        }
    }
}

class TShirt extends Cloth{
    public static double tshirtSales;
    public TShirt(String type, String color, String size, int price, boolean sale){
        super(type,color,size,price, sale);
        countOfTshirt++;
        
        if(sale){
            priceSale = 0.7*price;
            tshirtSales += priceSale;
        }
        else tshirtSales += price;
       
    }
    public static double totalSales(){
        return tshirtSales;
    }
    @Override
    public void printInformation(){
       
        if(sale){
            System.out.println("The "+color+" "+type+" size "+size
                    +" is on sale. The original price was "+price+" SEK, now it is 30% off. "
            +(int)priceSale+" SEK");
        }
        else{
            System.out.println("The "+color+" "+type+" size "+size
                    +" is not on sale and the price is "+price+" SEK.");
        }
    }
}

class Pants extends Cloth{
    public static double pantsSales;
    public Pants(String type, String color, String size, int price, boolean sale){
        super(type,color,size,price,sale);
        countOfPants++;
        
        if(sale){
            priceSale = 0.5*price;
            pantsSales += priceSale;
        }
        else pantsSales += price;
    }
    public static double totalSales(){
        return pantsSales;
    }
    
    @Override
    public void printInformation(){
       
        if(sale){
            System.out.println("The "+color+" "+type+" size "+size
                    +" is on sale. The original price was "+price+" SEK, now it is 50% off. "
            +(int)priceSale+" SEK");
        }
       
        else{
            System.out.println("The "+color+" "+type+" size "+size
                    +" is not on sale and the price is "+price+" SEK.");
        }
    }
}

class Shop{
    public static void main(String[] args) {
        
        List<Cloth> list = new ArrayList<Cloth>();
        list.add(new Dress("Dress","Red","36",500,true));
        list.add(new Dress("Dress","White","36",400,true));
        list.add(new Dress("Dress","Pink","38",250,false));
        list.add(new Dress("Dress","Purple","38",250,true));
        list.add(new TShirt("TShirt","Red","38",150,false));
        list.add(new TShirt("TShirt","Blue","38",150,false));
        list.add(new TShirt("TShirt","Yellow","38",150,false));
        list.add(new TShirt("TShirt","Brown","38",150,true));
        list.add(new TShirt("TShirt","Purple","38",150,true));
        list.add(new Pants("Pants","Blue","36",350,true));
        list.add(new Pants("Pants","Blue","38",350,false));
        list.add(new Pants("Pants","Black","36",400,true));
        list.add(new Pants("Pants","Black","38",400,false));
        
        Cloth.printNumberOfCloths();
        System.out.println("-----------------");
        Cloth.printTotalSale();
        System.out.println("-----------------");
        showPrint(list);
        /*for(Cloth show:list){
            show.printInformation();
        }
        */
    }
    
    public static void showPrint(List<Cloth> list){
         for(Cloth show:list){
            show.printInformation();
        }
    }
    
}