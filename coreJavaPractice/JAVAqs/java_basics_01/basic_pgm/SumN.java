class SumN 
{
	public static void main(String[] args) 
	{
		int num1=0,sum=0,limit=10;

		while (num1<limit)
		{
			sum=sum+num1;
			num1++;
		}

		System.out.println("sum 1 to "+limit+" :"+sum);
	}
}