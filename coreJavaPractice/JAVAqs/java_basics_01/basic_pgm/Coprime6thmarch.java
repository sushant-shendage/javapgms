class Coprime6thmarch
{
	public static void main(String[] args) 
	{
		int n1=23,n2=19,i=1;
		int small=n1>n2?n2:n1;
		while (true)
		{
			 

			if(small%n1==0 && small%n2==0)
			{
				System.out.println("LCM of  is :"+small);
				break;
			}
			small--;
		}
		if(small==1)
		{
			System.out.println("co prime number");
		}
		else
		{
			System.out.println("not co prime number");
		}
	}
}