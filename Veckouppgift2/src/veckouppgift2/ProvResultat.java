
package veckouppgift2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ProvResultat {
    String personnummer;
    char svenska;
    char engelska;
    
    public ProvResultat(String personnummer, char svenska, char engelska){
        this.personnummer = personnummer;
        this.svenska = svenska;
        this.engelska = engelska;
    }
}
    
class VisaElever{
    public static void main(String[] args) {
        List<ProvResultat> elever = new ArrayList<ProvResultat>();
        elever.add(new ProvResultat("710131-1234",'G','G'));
        elever.add(new ProvResultat("820228-2345",'U','G'));
        elever.add(new ProvResultat("930328-3456",'G','G'));
        elever.add(new ProvResultat("940428-4567",'G','U'));
        elever.add(new ProvResultat("950530-5678",'U','U'));
        elever.add(new ProvResultat("960615-6789",'U','U'));
        elever.add(new ProvResultat("710131-1234",'G','G'));
        
        System.out.println("Alla elever som har fått godkända i svenska eller engelska:");
        for(ProvResultat visa:elever){
           if(visa.engelska =='G'| visa.svenska == 'G'){
            System.out.println(visa.personnummer);
           }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Alla elever som har fått godkända både i svenska och engelska:");
        for(ProvResultat visa:elever){
           if(visa.engelska =='G'& visa.svenska == 'G'){
            System.out.println(visa.personnummer);
           }
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Alla elever som inte har fått godkänd i någon kurs:");
        for(ProvResultat visa:elever){
           if(visa.engelska =='U'& visa.svenska == 'U'){
            System.out.println(visa.personnummer);
           }
        }     
        
        
        
    }
         
}

