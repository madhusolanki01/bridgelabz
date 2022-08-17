package functionalprogram;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		double root1=0;
		double root2=0;
		System.out.println("Enter number a =");
		double a = sc.nextDouble();
		System.out.println("Enter number b =");
		double b = sc.nextDouble();
		System.out.println("Enter number c =");
		double c = sc.nextDouble();
		
		
		double delta = b*b - 4*a*c;
		double sqrt = Math.sqrt(delta);

		if(delta>0){
			root1 = (-b + sqrt(delta))/(2*a);
			root2 = (-b - sqrt(delta))/(2*a);
	         System.out.println("roots are--"+ root1 +" and "+root2);
	      }else if(delta == 0){
	         System.out.println("root is-- "+(-b + sqrt)/(2*a));
	      }
		
	}

	private static double sqrt(double delta) {
		// TODO Auto-generated method stub
		return 0;
	}

	}