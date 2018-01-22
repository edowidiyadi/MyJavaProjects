package One;

public class NotWhite {

	public static void main(String[] args) {
		
	String[][] Color= {{"White","Blue","Green"
			                ,"Red","White","Blue",
			                "White", "White","Blue",
			                "White","Blue","Green",
			                "White","Green"},
				           {"White","Blue","Green"
				           ,"Red","White","Blue",
				            "White", "White","Blue",
				            "White","Blue","Green",
				            "Red","White","Green"}};
int counter=0;
	
		
	for (int i=0; i<Color.length;i++) 
	{
		for (int j=0; j<=Color[i].length-1;j++) 
		{
			if (Color[i][j]!="White")
			{
			
			counter++;	
			}
			
		}
	
	}
	
	System.out.println("Antalet färger som inte är vita är "+counter);
		
	}

}
