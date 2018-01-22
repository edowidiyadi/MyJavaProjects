//import java.io.IOException;
public class TestDividedbyzeroException {

	public static void main(String[] args) {
		 int d = 0;
	      int n =20;
	     
	      try {
	            int fraction = n/d;
	           System.out.println("Exception has not thrown"+fraction);
	           }
	     
	      catch (ArithmeticException ex) 
	           {
	    	  System.out.println("Exception has Thrown and named as:"+ex);
	          
	           }
	      catch (NullPointerException ex) 
	      		{
		   	  System.out.println("Exception has Thrown and named as:"+ex);
		         
		        }
	      
	      catch(ArrayIndexOutOfBoundsException e){
	  		System.out.println("In the catch clock due to Exception = "+e);
	  	}
	      catch (Exception ex) 
    		{
	   	  System.out.println("Exception has Thrown and named as:"+ex);
	         
	        }
	      catch (Throwable ex) 
  		{
	   	  System.out.println("Exception has Thrown and named as:"+ex);
	         
	        }
	      
	      finally
	            {

	    	     System.out.println("Finally block has executed");
	           
	            }
	      
	}

}
