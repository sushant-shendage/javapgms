class PrimeNumAssignment01_4_03_24 	
{
	public static void main(String[] args) 
	{
		int num=13,i=2,c1num;
		c1num=num;

		System.out.println("num :"+num);


		while (i<(num/2))
		{
			if (num%i==0)
			{
				break;
			}
			i++;
		}


		if (i==(num/2))
		{
			System.out.println("Prime number");

			int rev=0;
			 while (n1num>0)
			 {
			 int mod=c1num%10;
			 rev=rev*10+mod;
			 c1num/=10;
			 }
				System.out.println("rev :"+rev);

			 if (num==rev)
			 {
				 System.out.println("Result :Twisted prime number");

			 }
			 else
			{
				 System.out.println("Result : not a twisted prime number");
			}
		}
		else
		{
			System.out.println("NOT a Prime number");
		}



	}
}
