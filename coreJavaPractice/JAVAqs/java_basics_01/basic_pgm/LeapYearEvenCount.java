class  LeapYearEvenCount
{
	
	public static void main(String[] args) 
	{
		 
		int year;
		int Lyr=0;
	for(year=1000;year<=3000;year++)
	{ 
		  if((year%4==0 && year%100!=0 )||( year%400==0 ))
		{
			if(year%2==0)
			{
				Lyr++;
			}
		}
		 
    }

	System.out.println("count : "+Lyr);
	}
}