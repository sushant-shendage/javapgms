class SmithNum5thMarch_16
{
	public static void main(String[] args) 
	{
		 int num=85,c1num=num,sum=0;
		
		int prime=2;



	while (num!=1)
	{
		if(num%prime==0)
		{
			num/=prime;

			sum+=Bl.digitSum(prime);
		}
		 
			prime=Bl.nextPrime(prime+1);
	}
		
	if (sum==Bl.digitSum(c1num))
	{
		System.out.println(c1num+" is a smith number");
	}	 
	else
	{
		System.out.println(c1num+" is a smith number");
	}
	}
//smith
	 
}