class PerfectNum6thMarch24_28
{
	public static void main(String[] args) 
	{
		for (int j=1;j<=100 ;j++ )
		{
			int num=j,sum=0;

		for (int i=1;i<num;i++ )
		{
			if (num%i==0)
			{
				 
				sum+=i;
			}
		}
		  
		 if (num==sum)
		 {
			 System.out.println(num+" is perfect number");
		 }
		/*  else
		 {
			 System.out.println(num+" is NoT perfect number");
		 }*/
		}
		
	}
}