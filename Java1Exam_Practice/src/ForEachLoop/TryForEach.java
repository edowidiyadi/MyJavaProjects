package ForEachLoop;
import java.util.Scanner;

public class TryForEach {

	public static void main(String[] args) {
		
		
	 Scanner scan= new Scanner(System.in);

	 String text= scan.nextLine();  //For string
		 
	 String[] s=text.split(" ");
     System.out.println(" The length of Text String is : "+text.length());
     
     System.out.println(" The length of S String is : "+s.length);
     
     for(String i:s)
     {
    	 System.out.println(i);
    	 
    	 
     }

     

     
    /* int num= scan.nextInt(); //for int

     System.out.println(num);
		                                */
		
		
		
		
	}

}
