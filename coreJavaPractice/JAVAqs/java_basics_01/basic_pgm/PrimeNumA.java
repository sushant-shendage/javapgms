class PrimeNumA	
{
	public static void main(String[] args) 
	{
		int num=18,i=2,rev=0;
		//c1num=num;

		System.out.println("num :"+num);


			while (i<=num)
			{
				if (num%i==0)
				{
					break;
				}
				i++;
			}


			if (i==num)
			{
				System.out.println("Prime number");
				 while (num>0)
				{
					int mod=num%10;
					rev=rev*10+mod;
					num/=10;
				 }
				System.out.println("rev :"+rev);
				while (i<rev)
				{
					if (rev%i==0)

					{
						break;
					}
					i++;
				}
					if (i==rev)
					{
						System.out.println("It is twisted prime number");
					}
					else
				{
					System.out.println("NOt Twisted Peime");
				}

				
			
		}
		else
		{
			System.out.println("NOT a Prime number");
		}
	}
}
