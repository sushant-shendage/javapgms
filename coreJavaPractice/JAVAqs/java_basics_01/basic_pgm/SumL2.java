class  SumL2
{
	public static void main(String[] args) 
	{
		int num=10,sum2=0,sum1;

		sum1=(num*(num+1))/2;

		for (int i=1;i<=num ;i++ )
		{
			sum2=sum2+i;
			
		}

		System.out.println("sum1 :"+sum1);
		System.out.println("sum2 :"+sum2);


	}
}