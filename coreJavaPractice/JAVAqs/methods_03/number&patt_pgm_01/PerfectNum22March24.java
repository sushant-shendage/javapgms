class PerfectNum22March24 
{
	public static void main(String[] args) 
	{
		PerfectNum(7);

	}

	public static void PerfectNum(int num)
	{
		int sum=0;
		for (int i=1;i<=num/2 ;i++ )
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		if(perfectNumOrNot(sum,num))
		{
			System.out.println(num+" is a perfect num");
		}
		else
		{
			System.out.println(num+" is not  a perfect num");
		}
	}
	public static boolean perfectNumOrNot(int num1,int num2)
	{
		return num1==num2;
	}
}