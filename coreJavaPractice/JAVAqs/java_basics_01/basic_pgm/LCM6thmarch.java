class LCM6thmarch 
{
	public static void main(String[] args) 
	{
		int n1=18,n2=18,i=1;
		int big=n1>n2?n1:n2;
		while (true)
		{
			 

			if(big*i%n1==0 && big*i%n2==0)
			{
				System.out.println("LCM of  is :"+big*i);
				break;
				
			}
		i++;
		}

	}
}
