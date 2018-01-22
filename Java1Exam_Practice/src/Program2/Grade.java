package Program2;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
				char [] grade={'A','B','C','D','E','F','A','B','C','A','B','C'
				     ,'A','B','C','C','D','E','F','C','D','E','F','C'
				     ,'D','E','F','A','B','C','A','B','C','D','E','D','E','B'};
		
		System.out.print("Mata in betysskala A-F :");
		
		int counter=0;
		char[] ch = new char[grade.length];
		Scanner scan=new Scanner(System.in);
		String input = scan.nextLine();
		char ch1 =input.charAt(0);
			
				
				for (int i=0;i<grade.length;i++) 
				{
				  if (ch1==grade[i])
				  {
				   ch[counter++]=ch1;
				  }		   
				 }
				
					
				System.out.print("Resultat :");
				for(int i =0; i<=counter;i++) 
				{
				System.out.print(" "+ch[i]);
				}
					
					System.out.println("\nDet finns "+counter+" elever som har fått "+ch1);
					System.out.println("The length of grade array is "+grade.length);
					System.out.print("Betygsmedelvärde:"+ ((double)counter/grade.length )  );
} }
