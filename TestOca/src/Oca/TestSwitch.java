package Oca;

public class TestSwitch {

	public static void main(String[] args) {
		
		String s= "A";
		int i=1;
		
		switch(s) 
		{
		case "A": System.out.println("This is case A");
	    		  break;
	    
		case "B": System.out.println("This is case B");
		          break;
		    
		case "C": System.out.println("This is case C");
		          break;
		    
	    default : System.out.println("This is case default");
	    	      break;
		}


		switch(i) 
		{
		case 1: System.out.println("This is case 1");
	    		  break;
	    
		case 2: System.out.println("This is case 2");
		          break;
		    
		case 3: System.out.println("This is case 3");
		          break;
		    
	    default : System.out.println("This is case default");
	    	      break;	
		}

		
} }
