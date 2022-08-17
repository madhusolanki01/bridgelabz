package day5;

public class prime {

	public static void main(String args[])
	{
		int n=11;
		int i;
		boolean b = true;
		for(i=2; i*i<=n; i++)
		{
			if(n%i==0)
			{
				b=false; 
				break;
			}
		}
			if(b==true)
			{
				System.out.println("this is prime number" +n);
			}
			else
			{
				System.out.println("this is not prime number--" +n);
			}
	}
}
