package day5;

public class swapvalue {
	
	public static void main(String args[])
	{
		int x=22; 
		int y=11;
		
		System.out.println("Before swap the value x and y");
		System.out.println("X=" +x);
		System.out.println("Y=" +y);
		
		int z =x;
		    x =y;
		    y =z;
		 
		 System.out.println("After Swap the value of x and y");
		 System.out.println("X=" +x);
		 System.out.println("Y=" +y);
		
		
	}
}
