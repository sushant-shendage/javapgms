import java.util.Scanner;
class PinVerification 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int savedPin=1234,pin,attempt=0,limit=3;
do{
		System.out.println("Enter your pin :");
		pin=sc.nextInt();
		if(savedPin==pin)
		{
			System.out.println("Logged in successfully :-)");
			break;
		}
		attempt++;
	 if(limit!=attempt)
		{
			System.out.println("remaining attempts :"+(limit-attempt));	
		}
		else
		{
			System.out.println("reached maximum attempt");
		}
 }
 while(attempt<limit);
	}
}