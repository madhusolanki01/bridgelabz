package day5;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =20; 
        int b= 30; 
        int c=40;
		if(a>=b && a>=c)
		{
			System.out.println("a is largest number:-" +a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("b is the largest number :-" +b);
		}
		else
		{
			System.out.println("c is the largest number:-" +c);
		}
	}

}
