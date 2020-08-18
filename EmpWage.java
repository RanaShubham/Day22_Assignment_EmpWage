
public class EmpWage {

	
	static int Wage_Per_Hour = 20;
	static int Full_Time_Hours = 8;
	static int Part_Time_Hours=4;
	static int Working_Days_Per_Month=20;
	static int Max_Wrk_Hrs=100;
	static int dailyFullTimeWage=Wage_Per_Hour*Full_Time_Hours;
	static int dailyPartTimeWage=Wage_Per_Hour*Part_Time_Hours;

	
	public static void main(String[] args) 
	{
				
		calcPartTimeWage();
		calcFullTimeWage();
				
	}
	
	private static int getAttendance()
	{
		return (int)(Math.floor(Math.random()*10)%2);
	}

	
	static void calcPartTimeWage()
	{
		int workHrsPartTime=0;
		int daysOfMonth=0;
		
		while(true)
		{
			++daysOfMonth;
			
			if(getAttendance() == 1)
			{
				workHrsPartTime=workHrsPartTime+Part_Time_Hours;
				
				if (workHrsPartTime+Part_Time_Hours > Max_Wrk_Hrs || daysOfMonth > Working_Days_Per_Month)
				{
					break;
				}
			}
		}
		System.out.println("This month part time employee worked " +workHrsPartTime+" hours and earned "+workHrsPartTime*Wage_Per_Hour+" Rupees" );
	}
	
	static void calcFullTimeWage()
	{

		int workHrsFullTime=0;
		int daysOfMonth=0;
		
		while(true)
		{
			++daysOfMonth;
			
			if(getAttendance() == 1)
			{
				workHrsFullTime=workHrsFullTime+Full_Time_Hours;
				
				if (workHrsFullTime+Full_Time_Hours > Max_Wrk_Hrs || daysOfMonth > Working_Days_Per_Month)
				{
					break;
				}
			}
		}
		System.out.println("This month full time employee worked " +workHrsFullTime+" hours and earned "+workHrsFullTime*Wage_Per_Hour+" Rupees" );
	
	}
}
