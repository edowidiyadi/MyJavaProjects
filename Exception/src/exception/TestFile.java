/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author edo
 */
public class TestFile {
    public static void main(String[] args) {
        java.io.File file = new java.io.File("W:\\data.txt");
        visa("Finns filen? "+file.exists());
        visa("Filen har "+file.length()+" bytes");
        visa("Läsbar? "+file.canRead());
        visa("Finns filen? "+file.exists());
        visa("Finns filen? "+file.exists());
        visa("Finns filen? "+file.exists());
        visa("Finns filen? "+file.exists());
        
    }
    
    public static void visa(String s){
        System.out.println(s);
    }
}
