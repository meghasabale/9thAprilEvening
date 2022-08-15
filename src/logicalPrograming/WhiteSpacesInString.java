package logicalPrograming;

public class WhiteSpacesInString
{

	public static void main(String[] args) 
	{
		String str ="My name is Aarush";
		int counter=0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
				char blank = str.charAt(i);
				
				if(blank==' ')
				{
					counter++;
				}
		}
		System.out.println("No of White spaces in String is :"+counter);


		
	}

}
