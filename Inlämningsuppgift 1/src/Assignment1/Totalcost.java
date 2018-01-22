package Assignment1;

public class Totalcost {

	public static void main(String[] args) {
		
		double[] itemsCost={10,12.3,33.4,21.6,50.4,13.3,12.3};
		int [] item= {1,3,3,4,1,2,7};
		double total;


		System.out.println("The Toatl Number of Items: "+itemsCost.length);
				total=Totalcost.cost(itemsCost, item);
		System.out.println("\nTotal Cost is:"+total);
	
	}
	
	public static double cost(double[] d, int[] item)
	
	{ double value=0;
	  
	  for (int i=0; i<item.length;i++)
	    {
			value=value+d[i]*item[i];
			
		}
					
		return value;
			
	} 	
}
