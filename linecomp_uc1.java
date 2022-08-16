import java.util.Scanner;

public class linecomp_uc1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter x1 and y1");
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			System.out.println("The Values of (x1,y1) :" + x1 + "," + y1);
			System.out.println("Enter x2 and y2");
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			System.out.println("The Values of (x2,y2) :" + x2 + "," + y2);

			double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
			System.out.println("Length of Line :" + length);
		}
	}

	}


