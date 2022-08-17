package functionalprogram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub

   	 	int x;
   	 	int y;
   	 
        double distance;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter x point");
  
        x=sc.nextInt();
   
        System.out.println("enter y point");
  
        y=sc.nextInt();
 	    
        distance=Math.sqrt(x*x + y*y);
 	    	 	    
	    System.out.println("distancebetween"+"("+x+","+y+")):--"+distance);

}

}

