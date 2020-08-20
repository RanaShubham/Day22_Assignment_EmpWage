
public class EmpWage {

    int Wage_Per_Hour = 0;
    int Full_Time_Hours = 0;
    int Part_Time_Hours=0;
    int Working_Days_Per_Month=0;
    int Max_Wrk_Hrs=0;
    String compName=null;
    
    EmpWage(String compName, int Wage_Per_hour, int Full_Time_Hours,int Part_Time_Hours,int Working_Days_Per_Month, int Max_Wrk_Hrs  )
    {
    	this.compName=compName;
    	this.Wage_Per_Hour=Wage_Per_hour;
    	this.Full_Time_Hours=Full_Time_Hours;
    	this.Part_Time_Hours=Part_Time_Hours;
    	this.Working_Days_Per_Month=Working_Days_Per_Month;
    	this.Max_Wrk_Hrs=Max_Wrk_Hrs;
    }


    public static void main(String[] args)
    {
    	EmpWage ibm = new EmpWage ("IBM",6,10,3,22,100);
    	EmpWage micrsft = new EmpWage ("Microsoft",10,8,4,28,200);
    	EmpWage brilab = new EmpWage ("BridgeLabz",8,12,6,18,120);
    	
    	micrsft.computePartTimeWage();
    	micrsft.computeFullTimeWage();
    	
    	System.out.println("\n");
    	
    	brilab.computePartTimeWage();
    	brilab.computeFullTimeWage();
    	
    	System.out.println("\n");
    	
    	ibm.computePartTimeWage();
    	ibm.computeFullTimeWage();
    }

    private static int getAttendance()
    {
            return (int)(Math.floor(Math.random()*10)%2);
    }


     void computePartTimeWage()
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
            System.out.println("This month "+compName+" part time employee worked " +workHrsPartTime+" hours and earned "+workHrsPartTime*Wage_Per_Hour+" Rupees" );
    }

     void computeFullTimeWage()
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
            System.out.println("This month "+compName+" full time employee worked "+workHrsFullTime+" hours and earned "+workHrsFullTime*Wage_Per_Hour+" Rupees" );

    }
}
