import java.util.Scanner;
class TwistedEvenNum
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			int revNum=0,numMod;

				System.out.println("\nEnter any positive integer number : ");
				int num=sc.nextInt();
				int original_num=num;
			

			if(original_num%2==0)
			{
				

				System.out.println("Entered integer                   : "+num);

				while(num>0)
				{
					numMod=num%10;
					revNum=revNum*10+numMod;
					num/=10;
				}

					System.out.println("reverce of entered number integer : "+revNum);


					if(revNum%2==0)
				{
					System.out.println("Result:Given number is twisted even number");
				}
				else
				{
					System.out.println("Result:Given number is not a twisted even number");
					
				}

				
			} 

			
		}
	}
}