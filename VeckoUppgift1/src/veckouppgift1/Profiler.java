/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veckouppgift1;

/**
 *
 * @author edo
 */
public interface Profiler {
    String bakgrund();
    String work();
    
}

class Turing implements Profiler{
    public String bakgrund(){
        return "Bakgrund: Alan Mathison Turing född 23 juni 1912 i Maida Vale, London, död genom\n" +
"förgiftning den 7 juni 1954 i Wilmslow, Cheshire, var en brittisk matematiker, logiker och\n" +
"kryptoanalytiker. Han studerade vid King's College, Cambridge och sedan vid Princeton\n" +
"1936–1938.";
    }
    
    public String work(){
        return "Arbete: Alan Turing lade en stor del av grunderna för dagens informations- och\n" +
"datorteknologi. Han är mest känd för turingtestet, turingmaskinen och sina insatser i andra\n" +
"världskriget med kodknäckandet av tyskarnas Enigmachiffer.";
    }
}

class Boole implements Profiler{
    public String bakgrund(){
        return "Bakgrund: George Boole, född 2 november 1815, död 8 december 1864, var en brittisk\n" +
"matematiker och filosof. Han är känd som skaparen av Boolesk algebra, grunden för all\n" +
"modern datoraritmetik.";
    }
    
    public String work(){
        return "Arbete: 1854 publicerade han An investigation into the Laws of Thought, on Which are\n" +
"founded the Mathematical Theories of Logic and Probabilities. I denna skrift behandlade\n" +
"Boole logik på nytt sätt genom att reducera logiken till en enkel algebra. Logiska satser\n" +
"kunde beskrivas med symbolisk notation och manipuleras enligt regler som liknade den\n" +
"normala matematikens. Detta var början till vad som nu kallas Boolesk algebra.";
    }
}

class TextInfo{
    public static String turingBakgrund(){
        Turing turing = new Turing();
        return turing.bakgrund();
    }
    public static String turingWork(){
        Turing turing = new Turing();
        return turing.work();
    }
    public static String booleBakgrund(){
        Boole boole = new Boole();
        return boole.bakgrund();
    }
    public static String booleWork(){
         Boole boole = new Boole();
        return boole.work();
    }
}

class TestProfiler{
    public static void main(String[] args) {
        TextInfo info = new TextInfo();
        System.out.println(info.booleBakgrund()+"\n\n"+info.booleWork()+"\n\n"
                +info.turingBakgrund()+"\n\n"+info.turingWork());
        
        
         /*Turing turing = new Turing();
        Boole boole = new Boole();
        System.out.println(boole.bakgrund()+"\n\n"+boole.work());
        System.out.println();
        System.out.println(turing.bakgrund()+"\n\n"+turing.work());
        System.out.println();*/
    }
}