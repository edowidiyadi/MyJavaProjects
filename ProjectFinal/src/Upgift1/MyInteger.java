
package Upgift1;

public class MyInteger {
    public static void main(String[] args) {
        MyVector mV = new MyVector(20);
         mV.change(15, 0);
         
         System.out.println("Max value" + mV.max());
         mV.show();
         mV.removeLast();
         mV.show();
    }
}
