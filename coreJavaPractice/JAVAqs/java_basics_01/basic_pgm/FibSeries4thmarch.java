class FibSeries4thmarch
{
	public static void main(String[] args) 
	{
		int num1=0,num2=1,sum;

		for (int i=1; i<=10;i++ )
		{
			System.out.print(num1+",");
			sum=num1+num2;
			num1=num2;
			num2=sum;
		}
	}
}
