package Program4;

import java.util.Scanner;

public class InputData {

	public static void main(String[] args) {
		
		
		 Scanner scan= new Scanner(System.in);

		 String text= scan.nextLine();  //For string
			 
		 String[] s=text.split(" ");
		 
	
		 
	     System.out.println("The length of Text String is : "+text.length());
	     
	     System.out.println("The length of S String is : "+s.length);
	     
	    for(int i =0; i<s.length;i++) 
	    	  {
	    	
	    	System.out.println(s[i]+" "+s[++i]+" "+s[++i]);
	    	
	    }
	   	     
	}

	
	}

