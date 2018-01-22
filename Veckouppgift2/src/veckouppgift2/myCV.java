/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veckouppgift2;
import java.util.Arrays;

/**
 *
 * @author edo
 */
interface PersonalProfile {
    public String personalpro();
}
interface Education{
    public String education();
}
interface Work{
    public String work();
}
interface Other{
    public String other();
}
interface Language{
    public String language();
}
interface Competens{
    public String competens();
}
interface DrivingLicense{
    public String drivelic();
}
interface Reference{
    public String reference();
}

public class myCV implements PersonalProfile,Education,Work,Other,Language,Competens,DrivingLicense,Reference{
public String personalpro(){
    return"CV\n" +
"\n" +
"Andreas Andersson\n" +
"Professorsslingan 43\n" +
"114 71 Storstan\n" +
"\n" +
"Telefon, hem: 08 – 000 00 00\n" +
"Telefon, mobil: 073 – 000 00 00";
}
public String education(){
    return"Utbildning\n" +
"\n" +
"Kandidatprogram i ekonomi (120p), Stockholms Universitet	aug 2006 – jun 2009\n" +
"Läste kurser i bland annat företagsekonomi och redovisning. Under sista året läste jag fördjupande kurser om statistik. 	\n" +
"\n" +
"Samhällsvetenskapsprogrammet, Sannarpsgymnasiet, Halmstad	aug 2003 – jun 2006\n" +
"Gymnasieutbildning i samhällsvetenskap. Väckte mitt intresse för vidare studier i ekonomi.	";
}
public String work(){
    return"Anställningar\n" +
"\n" +
"Bergshamra Städ AB, Solna	Jun 2007 – aug 2009\n" +
"Arbetade extra vid behov, ca 3 dagar i månaden, samt heltid under två somrar. Hjälpte till med bokföring och lönearbete. Lärde mig använda ekonomiprogram från SPCS.	\n" +
"\n" +
"Joppes plåtslageri KB, Halmstad	sommar 2005, 2006\n" +
"Allt-i-allo. Tog hand om diverse kontorsarbete, enklare bokföring och svarade i telefon. Självständigt arbete med stort ansvar när den ordinarie ekonomipersonalen var på semester.	";
}
public String other(){
    return"Övriga meriter\n" +
"\n" +
"Fotbollsspelare, Gärdet BK		2007 –\n" +
"Spelar sedan 2 år tillbaka i div 6-laget Kärrtorps BK. Är en pådrivare på plan och har varit lagkapten den senaste säsongen.	\n" +
"\n" +
"Språkkurs, Brighton	sommaren 2002\n" +
"Vistades 6 veckor i Brighton. Pratade engelska dagligen vilket förbättrade mina kunskaper i språket avsevärt.	";
}
public String language(){
    return"Språk\n" +
"\n" +
"Svenska, modersmål\n" +
"Engelska, mycket bra i tal och skrift\n" +
"Tyska, grundläggande kunskaper";
}
public String competens(){
    return"Datorkunskaper\n" +
"\n" +
"Stor vana att jobba med Word, Excel m.fl. vanliga kontorsprogram. \n" +
"Har också erfarenhet av att jobba med ett flertal av SPCS ekonomiprogram, \n" +
"bland annat SPCS Lön och SPCS Adminstration 500.";
}
public String drivelic(){
    return"Körkort\n" +
"\n" +
"Innehar B-körkort.";
}
public String reference(){
    return"Referenser\n" +
"\n" +
"Referenser lämnas på förfrågan.";
}
public String toString(){
    return this.personalpro()+"\n\n"+this.education()+"\n\n"+this.work()
            +"\n\n"+this.other()+"\n\n"+this.language()+"\n\n"+this.competens()
            +"\n\n"+this.drivelic()+"\n\n"+this.reference();
}

}
class testMyCV{
    public static void main(String[] args) {
       myCV cv = new myCV();
        //System.out.println(cv);
        //System.out.println("");
        //System.out.println("-----------------------------------------");
       String[] myCV = {cv.personalpro(),cv.education(),cv.work(),cv.other(),cv.language(),cv.competens(),cv.drivelic(),cv.reference()};
        for (String x:myCV) {
            System.out.println(x);
            System.out.println();
            System.out.println();
        }
       
    }
}
    

