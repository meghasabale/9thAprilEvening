package logicalPrograming;

public class ReverseTheNumber 
{

	public static void main(String[] args) 
	{
		int num=12345;
	String s=Integer.toString(num);
	 String r="";
	 
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 r=r+s.charAt(i);
	 }
	 int revNum = Integer.parseInt(r);
	 System.out.println("original num is :"+num);
	 System.out.println("Reverse num is "+revNum);
	}
	

}


