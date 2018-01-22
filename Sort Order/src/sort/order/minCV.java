/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.order;

/**
 *
 * @author edo
 */
interface CV {
    public String visaCV();
}

class minCV implements CV{
    private String personInfo;
    public minCV(String personInfo){
        this.personInfo = personInfo;
    }
    public String visaCV(){
        return personInfo;
    }
}

class utbildning implements CV{
    private String utbildning;
    public utbildning(String utbildning){
        this.utbildning = utbildning;
    }
    public String visaCV(){
        return utbildning;
    }
}

class anställningar implements CV{
    private String anställningar;
    public anställningar(String anställningar){
        this.anställningar = anställningar;
    }
    public String visaCV(){
        return anställningar;
    }
}

class övrigaMeriter implements CV{
    private String övrigaMeriter;
    public övrigaMeriter(String övrigaMeriter){
        this.övrigaMeriter = övrigaMeriter;
    }
    public String visaCV(){
        return övrigaMeriter;
    }
}

class språk implements CV{
    private String språk;
    public språk(String språk){
        this.språk = språk;
    }
    public String visaCV(){
        return språk;
    }
}
class datorkunskaper implements CV{
    private String datorkunskaper;
    public datorkunskaper(String datorkunskaper){
        this.datorkunskaper = datorkunskaper;
    }
    public String visaCV(){
        return datorkunskaper;
    }
}
class körkort implements CV{
    private String körkort;
    public körkort(String körkort){
        this.körkort = körkort;
    }
    public String visaCV(){
        return körkort;
    }
}
class referenser implements CV{
    private String referenser;
    public referenser(String referenser){
        this.referenser = referenser;
    }
    public String visaCV(){
        return referenser;
    }
}

class testaMinCV{
    public static void main(String[] args) {
       CV[] cv = new CV[8];
       cv[0] = new minCV("CV \nAndreas Andersson\n" +
"Professorsslingan 43\n" +
"114 71 Storstan\n" +
"\n" +
"Telefon, hem: 08 – 000 00 00\n" +
"Telefon, mobil: 073 – 000 00 00");
       cv[1] = new utbildning("Kandidatprogram i ekonomi (120p), Stockholms Universitet	aug 2006 – jun 2009\n" +
"Läste kurser i bland annat företagsekonomi och redovisning. Under sista året läste jag fördjupande kurser om statistik. 	\n" +
"\n" +
"Samhällsvetenskapsprogrammet, Sannarpsgymnasiet, Halmstad	aug 2003 – jun 2006\n" +
"Gymnasieutbildning i samhällsvetenskap. Väckte mitt intresse för vidare studier i ekonomi.	"); 
       cv[2] = new anställningar("Bergshamra Städ AB, Solna	Jun 2007 – aug 2009\n" +
"Arbetade extra vid behov, ca 3 dagar i månaden, samt heltid under två somrar. Hjälpte till med bokföring och lönearbete. Lärde mig använda ekonomiprogram från SPCS.	\n" +
"\n" +
"Joppes plåtslageri KB, Halmstad	sommar 2005, 2006\n" +
"Allt-i-allo. Tog hand om diverse kontorsarbete, enklare bokföring och svarade i telefon. Självständigt arbete med stort ansvar när den ordinarie ekonomipersonalen var på semester.	");
       cv[3] = new övrigaMeriter("Fotbollsspelare, Gärdet BK		2007 –\n" +
"Spelar sedan 2 år tillbaka i div 6-laget Kärrtorps BK. Är en pådrivare på plan och har varit lagkapten den senaste säsongen.	\n" +
"\n" +
"Språkkurs, Brighton	sommaren 2002\n" +
"Vistades 6 veckor i Brighton. Pratade engelska dagligen vilket förbättrade mina kunskaper i språket avsevärt.	");
       cv[4] = new språk("Svenska, modersmål\n" +
"Engelska, mycket bra i tal och skrift\n" +
"Tyska, grundläggande kunskaper");
       cv[5] = new datorkunskaper("Stor vana att jobba med Word, Excel m.fl. vanliga kontorsprogram. \n" +
"Har också erfarenhet av att jobba med ett flertal av SPCS ekonomiprogram, \n" +
"bland annat SPCS Lön och SPCS Adminstration 500.");
       cv[6] = new körkort("Innehar B-körkort.");
       cv[7] = new referenser("Referenser lämnas på förfrågan.");
       
       
    }
    
}
