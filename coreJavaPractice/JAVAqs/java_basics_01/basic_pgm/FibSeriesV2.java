class FibSeriesV2 
{
	public static void main(String[] args) 
	{
		 int sum=0;

		for (int i=0; i<11;i++ )
		{
			int fnum;
			
			if(i<2)
			{
				fnum=i;
				  
			}
			else
			{
				fnum=sum;
				  
			}
			
			 sum=sum+fnum;
			  /*System.out.println(sum+",");
			  System.out.println("--------------------------");*///TRY
		}
	}
}