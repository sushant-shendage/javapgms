class RamanujNum28March24 
{
	public static void main(String[] args) 
	{
		 //ramanujNum(344);
		 ramanuj(1729);
	}
	/*public static void ramanujNum(int num)
	{
		if(ramanuj(num))
		{
			System.out.println(num+" is ramanuj num");
		}
		else
		{
			System.out.println(num+" is not ramanuj num");
		}
	}
*/
	public static void ramanuj(int num)
	{
		int flag1=0,flag2=0,i=0,j=0,k=0,l=0;

		for (i=1; i<=num;i++ )
		{
			for ( j=1;j<=num ;j++ )
			{
				if (i*i*i+j*j*j==num)
				{
					flag1=1;
					break;
				}
			}
		}
System.out.println("i :"+i+" j :"+j);

		 
		if(flag1==1)
		{
			for (k=i+1; k<=num;k++ )
			{
			for ( l=j+1;l<=num ;l++ )
				{
				/*if(k==i && l==j)
					{
						continue;
					}*/
				if (k*k*k+l*l*l==num)
					{
					flag2=1;
					break;
					}
				}
			}
		}
		System.out.println("k :"+k+" l :"+l);
		//return flag1==1 && flag2==1;
		
	}
}
