package Assignment1;

public class Change {

	public static void main(String[] args) 
	{
		
		
		StringBuilder sb= new StringBuilder("Sverige");
		char ch='S';
		
		System.out.println("The stringBuilder before method call: "+sb);
		System.out.println("The charcter before method call: "+ch);
	
		Change.change(sb,ch);

		System.out.println("The stringBuilder after method call: "+sb);

		
	}
	
	public static void change(StringBuilder s, char ch) 
	{
		
		
		s=s.append(ch);
		
	
		
	}

}
