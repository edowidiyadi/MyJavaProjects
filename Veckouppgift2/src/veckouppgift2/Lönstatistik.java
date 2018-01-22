package veckouppgift2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SkapaLista {
    String namn;
    int lön;
    
    public SkapaLista(String namn,int lön){
        this.namn = namn;
        this.lön = lön;
    }
}
    
public class Lönstatistik{
    public static void main(String[] args) {
        List<SkapaLista> listan = new ArrayList<SkapaLista>();
        listan.add(new SkapaLista("Samtliga sektorer",41800));
        listan.add(new SkapaLista("Statlig sektor",38600));
        listan.add(new SkapaLista("kommunal sektor",36000));
        listan.add(new SkapaLista("Landstingssektorn",37600));
        listan.add(new SkapaLista("Privat sektor",42300));
        listan.add(new SkapaLista("Privatanställda tjänstemän",42300));
        int avg = 0;
        int count = 0;
        System.out.println("Lönestatistik baserat på Sektor");
        for(SkapaLista visa:listan){
            System.out.format("%-32s%10d%2s",visa.namn,visa.lön,"kr");
            System.out.println("");
            avg+=visa.lön;
            count++;
        }
        System.out.format("%-32s%10d%2s","och genomsnittslöner är ",avg/count,"kr");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        
        Collections.sort(listan, new Comparator(){
            @Override
            public int compare(Object listanförst, Object listanandra) {
                return (new Integer(((SkapaLista) listanförst).lön))
                        .compareTo(((SkapaLista) listanandra).lön);
            }
        });
        System.out.println("Lönestatistik med stigande ordning");
        for(SkapaLista visa:listan){
            System.out.format("%-32s%10d%2s",visa.namn,visa.lön,"kr");
            System.out.println("");  
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Sektorerna som tjänar mera än 40000 kr:");
        for(SkapaLista visa:listan){
            if (visa.lön > 40000) {
                System.out.format("%-32s%10d%2s",visa.namn,visa.lön,"kr");
            System.out.println("");
            }
              
        }
        
        
    }
         
}
