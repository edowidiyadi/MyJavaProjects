/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Upgift6;

/**
 *
 * @author woj
 */
public class ShowResultat {
    public static void main(String[] args) {
          
   String [] nameList={"Annie", "Eddie", "Hase","Jenny", "Moody"};
   Integer [] listResultat= {10, 20, 30 ,40, 50};
   
   ListShower lambdaList = (String[] nS, Integer[] nN)->{
       for( int i=0; i<nS.length; i++){
           System.out.println(nS[i]+ "   "+ Integer.toString(nN[i]));
       }
   };
   lambdaList.showList(nameList, listResultat);
}}
