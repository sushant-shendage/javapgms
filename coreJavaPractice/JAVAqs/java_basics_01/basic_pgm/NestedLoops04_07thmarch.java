class  NestedLoops04_07thmarch
{
	public static void main(String[] args) 
	{
		 int num=145,c1num,sum=0;
		 c1num=num;
		System.out.println("num :"+num);
		while (num>0)
		{
			int mod=num%10;

			
			int fact=1;
			for (int i=1;i<=mod ;i++ )
			{
				fact=fact*i;
			}

			sum=sum+fact;
			//System.out.println("sum of all  :"+sum);

			num/=10;

		}

		System.out.println("sum of all factorial :"+sum);
		 
		 if (c1num==sum)
		 {
			System.out.println("Strong num:"+c1num);
		 }
		 else
		 {
			System.out.println("not a Strong num:"+c1num);	
		 }

	}
}