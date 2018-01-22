package Assignment1;

public class TestAverage {

	public static void main(String[] args) {
		
		int total=0;
		int average=27;
		
		int [][][]v= {	
		{{2,1,3},{4,5,6},{7,8,9}},
		{{3,2,1},{6,5,4},{9,8,7}},
		{{1,3,2},{4,6,5},{9,8,7}}
		};		
			
		for (int i=0;i<v.length;i++) 
		{
		 for (int j=0;j<v.length;j++) 
		 {			
		  for(int k=0; k<v.length;k++)
		   {
			total=total+v[i][j][k];
		   }
		  }
		}
		
		System.out.println("Summan av alla element i vektorn v: "+total);
		System.out.println("\nMedelvärdet av alla heltal i vektorn är: "+ (total/average));
	}
}
	
