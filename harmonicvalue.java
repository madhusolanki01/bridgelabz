package day5;

public class harmonicvalue {
	public static void main(String args[])
	{
		// compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double val = 0.0;
        int n =3;
		for (int i = 1; i <= n; i++) 
		{
		//sum += 1.0 / i;
		val = val + (1.0/i);
		}
		System.out.println("this is harmonic value-" +val);
	}

}
