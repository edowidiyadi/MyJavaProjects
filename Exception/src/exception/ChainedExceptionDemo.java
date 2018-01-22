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
public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public static void method1() throws Exception {
        try{
            method2();
        }catch (Exception ex) {
            throw new Exception("Ny info från method1",ex);
        }
        
    }
    public static void method2() throws Exception{
        throw new Exception("Ny info från method2");
    }
}
