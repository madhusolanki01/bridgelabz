package day3;

import java.util.Random;

public class EmpSwitchcase_uc4 {


	private static Object random;

	public static void main(String[] args, Math math) 
	{
		{
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			int Wage_Per_Hour =20;

			int empHrs = 0;
			int empWage = 0;
			int totalEmpWage = 0;
				
			int empcheck=(int) Math.floor(Math.random()*10)%3;
			switch(empcheck)
			{
			case IS_PART_TIME:
				int emphrs=4;
				break;
			case IS_FULL_TIME:
				emphrs=8;
				break;
			default:
				emphrs=0;
				
				
				empWage = empHrs *Wage_Per_Hour;
				System.out.println("employee wage"+ empWage);
			}
		}
	}
}

				
				
		
}
	
