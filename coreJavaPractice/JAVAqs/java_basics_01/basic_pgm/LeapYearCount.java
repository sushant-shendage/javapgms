import java.util.Scanner;

class  LeapYearCount
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int year;
		int Lyr=0;
	for(year=1000;year<=3000;year++)
	{ 
		  if((year%4==0 && year%100!=0 )||( year%400==0 ))
		{

			Lyr++;
		}
		 
    }

	System.out.println("count : "+Lyr);
	}
}
//year<1582
//2000 to 5000
//leap year count
//even leap year