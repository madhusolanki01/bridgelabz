package day5;

public class Leapyear {

	public static void main(String args[])
	{
	
		int year=1395;
	
		if(year % 4==0)
		{
			if(year %100==0)
			{
				if(year %400==0) 
				{
					System.out.println("it is leap year" +year);
				}
				else
				{
					System.out.println(" is not a leap year" +year);
				}
			}
		}
	}
}
			
	

