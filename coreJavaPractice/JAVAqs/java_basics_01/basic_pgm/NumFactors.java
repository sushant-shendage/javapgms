class NumFactors
{
	public static void main(String[] args) 
	{
		int num=4;
		System.out.println("num:"+num);

		for (int i=1;i<=num ;i++ )
		{
			
			if(num%i==0)
			{
			System.out.println(i);
			}
		}

		//System.out.println("Hello World!");
	}
}