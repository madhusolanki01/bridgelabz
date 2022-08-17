package day3;

public class empcheck_uc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int is_full_time=1;
		double EMPCHECK =Math.floor((Math.random()*10)%2);
			if(EMPCHECK ==is_full_time)
			{
				System.out.println("Employee is Present");
			}
			else
			{
				System.out.println("Employee is Absent");
			}
		}

}
