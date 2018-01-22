/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKlassSubklass;

/**
 *
 * @author edo
 */
class X {
    public int getU(){
        return 0;
    }
    
}

class Y extends X {
    public int getV(){
        return 1;
    }
}

class AnvandXY{
    public static void main(String[] args) {
        X x1 = new X();
        X x2 = new Y();
        Y y = new Y();
       
        int i1 = x1.getU();
        int i2 = x1.getV();
        int i3 = x2.getU();
        int i4 = x2.getV();
        int i5 = y.getU();
        int i6 = y.getV();
        System.out.println(i1+" "+i2+" "+i3);
        System.out.println(a1+" "+a2+" "+b);
    }
}
