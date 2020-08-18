
public class EmpWage {

	public static void main(String[] args) 
	{
		int Wage_Per_Hour = 20;
		int Full_Day_Hours = 8;
		int Is_Full_Time=1;
		int Part_Time_Hours=4;
		
		int dailyFullTimeWage=Wage_Per_Hour*Full_Day_Hours;
		int dailyPartTimeWage=Wage_Per_Hour*Part_Time_Hours;
		
		double empCheck = Math.floor(Math.random()*10)%2;
		
		if (empCheck == Is_Full_Time)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Enmployee is not present");
		}
		
		System.out.println("Daily wage of full time employee is"+dailyFullTimeWage);
		System.out.println("Daily wage of part time employee is"+dailyPartTimeWage);
	}

}
