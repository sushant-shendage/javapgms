class catlonNum30March24l1w1 
{
	public static void main(String[] args) 
	{
		int num=5;
		 for (int i=0;i<=num ;i++ )
		 {
			 System.out.print(fact(2*i)/(fact(i+1)*fact(i))+",");
		 }
	}
	public static int fact(int num)
	{
		int prod=1;
		for (int i=1;i<=num ;i++ )
		{
			prod*=i;
		}
		return prod;
	}
}