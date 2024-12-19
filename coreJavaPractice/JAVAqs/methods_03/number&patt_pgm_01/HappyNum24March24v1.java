class HappyNum24March24v1
{
	public static void main(String[] args) 
	{
		happyNum(44);
	}
	public static void happyNum(int num)
	{
		if(happy(num))
		{
			System.out.println(num+" is a happy number");
		}
		else
		{
			System.out.println(num+" is not a happy number");
		}
	}

	public static boolean happy(int num)
	{
		int sum;
		while(true)
		{
			 sum=0;
			for (int i=num;i!=0 ;i/=10 )
			{
				sum+=digitSqr(i%10);
			}
				num=sum;
				if(num==4 ||num==1 )
			    {
					break;
			    }
		}

			if(num==1)
			{
				return true;
			}
			else
			{
				return false;
			}
		
				 
	}

	public static int digitSqr(int num)
	{
		return num*num;	
	}
}