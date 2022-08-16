package day3;

import java.util.Random;

public class calculateEmp_uc3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		{
		
			int Wage_Per_Hour =20;
			int part_time_hour =8;
			Random random =new Random();
			int employeecheck =random.nextInt();
				if(employeecheck == part_time_hour);
				{
		           int empWage = part_time_hour * Wage_Per_Hour;
		           System.out.println("part time Emp Wage: " + empWage);
		        }
				
	    }
	}
		
}

