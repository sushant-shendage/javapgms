class StrongNum7thmarch 
{
	public static void main(String[] args) 
	{
		int num=153,c1num,c2num,count=0,sum=0;
		 c1num=num;
		 c2num=num;
		while(c1num>0)
		{
			c1num/=10;
			count++;
		}
		//System.out.println("digit count : "+count);

		while(c2num>0)
		{
			int mod=c2num%10;
			

			int powerVal=1;
			for (int i=1;i<=count ;i++ )
			{
				powerVal=powerVal*mod;
			}

			sum=sum+powerVal;
			c2num/=10;
		}

		if(sum==num)
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}
	}
}
