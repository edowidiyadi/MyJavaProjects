package Program3;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
				
		
			if(scan.hasNextInt()) {
				
				int num1= scan.nextInt();
				int num2= scan.nextInt();
				System.out.println("Minimum number is :"+ min(num1,num2));
			}
			
			else if (scan.hasNextFloat())
			{
				float f3= scan.nextFloat();
				float f4= scan.nextFloat();
				
				System.out.println("Minimum number is :"+ min(f3,f4));
			}
		
		
		
	}
	public static int min(int num1, int num2) 
	{ 
		if (num1>num2)
		{
		     return num2;
		}
		else
		     return num1;
		
	}
	public static float min(float num3, float num4) 
	{
		if (num3>num4)
		{
		     return num4;
		}
		else
		     return num3;
		
	}
	
}
