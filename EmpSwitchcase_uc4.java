package day3;

import java.util.Random;

public class EmpSwitchcase_uc4 {


	private static Object random;

	public static void main(String[] args) 
	{
		{
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			int Wage_Per_Hour =20;
			int working_dayper_month = 20;
			int empHrs = 0;
			int empWage = 0;
			int totalEmpWage = 0;
				
				
			for(int day=1; day<=working_dayper_month; day++) 
			{
				Random random =new Random();
				int employeecheck =random.nextInt();
					switch(employeecheck) {
						case 1:
						{
							empHrs = 8;
							break;
						}
						case 2:{
							empHrs = 4;
							break;
						}
						default : {
							 empHrs = 0;
						}
					}
					empWage = empHrs *Wage_Per_Hour;
					totalEmpWage += empWage;
			}
				System.out.println("Total month Employee wage is " +totalEmpWage);
		}
    }
}
	
