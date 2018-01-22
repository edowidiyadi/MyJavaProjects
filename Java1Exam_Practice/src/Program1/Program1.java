package Program1;

public class Program1 {

	public static void main(String[] args) {
		
		char  ch[]={'A','B','C','D','E','F','G','H','I'
				,'J','K','L','M','N','O','P','Q','R','S'
				,'T','U','V','W','X','Y','Z','Å','Ä','Ö'};
		int n=2;
	    
		System.out.println("The length of array is  :"+ch.length);
		
		 double num=(double)ch.length/3;
         
		System.out.println("The 1/3 of array is  :"+ num );
	       for(int i=ch.length-1;i>=0;i--)
	       {
	                     
	           System.out.print(" "+ch[i]);
	          
	          	           
	           if(n*num>=i)
	           {
	        	   System.out.println();
	        	n--;   
	           }
	                                
	       
	       
	       }  

	}

}
