class DeficentAbundentNum29March24
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=300 ;i++ )
		{
			defficientAbundentNum(i);
		}
		 
	}

	public static void defficientAbundentNum(int num)
	{
		if(defficientAbundent(num)==1)
		{
			System.out.println(num +" is a deficent num");
		}
		 
		else if(defficientAbundent(num)==2)
		{
			System.out.println(num +" is a Abundent num");	
		}
		else
		{
			System.out.println(num +" is a perfect num");
		}
	}
	public static int defficientAbundent(int num)
	{
		int i,sum=0;
		for ( i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}

		if(sum<num)
		{
			return 1;
		}
		else if(sum>num)
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}
}
