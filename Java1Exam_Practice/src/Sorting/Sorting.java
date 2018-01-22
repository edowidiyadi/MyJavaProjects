package Sorting;

public class Sorting {

	public static void main(String[] args) {
		
		
		int[][][] v= {{{2,1,3},{4,5,6},{7,8,9}},
				      {{3,2,1},{6,5,4},{9,8,7}},
				      {{1,3,2},{4,6,5},{9,8,7}}     
			         };
int temp=0;
	
         System.out.print(" Före sorteringen");
		
		for(int i=0;i<v.length;i++) 
		{
			System.out.println("");
			
			for(int j=0;j<v[i].length;j++)
			{
				for(int k=0;k<v[j].length;k++)
				{
					
				System.out.print(" "+v[i][j][k]);	
				}
				
			}
			
		}
		
		
		 System.out.print("\n\n Efter sorteringen");
		for(int i=0;i<v.length;i++) 
		{
			System.out.println("");
			
			for(int j=0;j<v[i].length;j++)
			{
				for(int k=0;k<v[j].length;k++)
				{ 
					if (v[i][j][0] > v[i][j][1]) {
				       temp = v[i][j][0];
				       v[i][j][0] = v[i][j][1];
				       v[i][j][1] = temp;
				    }

					if (v[i][j][1] > v[i][j][2]) {
				       temp = v[i][j][1];
				       v[i][j][1] = v[i][j][2];
				       v[i][j][2] = temp;
				    }

					 if (v[i][j][0] > v[i][j][1]) {
				       temp = v[i][j][0];
				       v[i][j][0] = v[i][j][1];
				       v[i][j][1] = temp;
				    }
				
					
					 
				System.out.print(" "+v[i][j][k]);	
				
				} } }	 
}
} 