package Program5;

import java.util.Scanner;

public class Identify {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System.in);
		String input = scan.nextLine();
		
		if (isNumeric(input)) {
		
		System.out.println("This is number :"+input);
		}
		else if(isBokstar(input)) 
		{
			System.out.println("This is Character :"+input);
			
		}
		   
					
	}

	public static boolean isNumeric(String input)
	{
	    try{
	        int num = Integer.parseInt(input);
	        return true;
	    }
	    
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	
		}
	
	public static boolean isBokstar(String input)
	{
	    try{
	        char ch =input.charAt(0);
	        
	        if (ch >= 'A' && ch >= 'Z' || ch >= 'a' && ch >= 'z') 
	        {
	        
	        	return true;	
	        }
	        else {
	        	System.out.println("This is not bokstavar");
	        	return false;
	        }
	        
	        	
	        

	        	    }
	    
	    catch(NumberFormatException ex)
	    {
	        return false;
	    }
	
	
}}
