class StrongNumRange02_7thmarch24 
{
	public static void main(String[] args) 
	{
		for (long j=1; j<=150;j++ )
		{
			long num=j;
			long c1num,sum=0l;
		 c1num=num;

		 while (c1num>0)
		 {
			long  mod=c1num%10;

			long fact=1;
			for (long i=1;i<=mod ;i++ )
			{
				fact=fact*i;
			}

			sum=sum+fact;
			System.out.println("sum : "+sum);
			c1num/=10;
		 }
		
		if(num==sum)
		{
			System.out.println("Strong num : "+num);
		}
		}
	}
}
