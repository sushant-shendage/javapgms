class DuckNum48
{
	public static void main(String[] args) 
	{
		int count=1,num=1;
		 while (count<49)
		 {
			for (int i=num;i!=0 ;i/=10 )
			{
				 if(i%10==0)
				 {
					System.out.println("num"+count+"+ :"+num);
					
					count++;
					break;
				 }
			}
			num++;
			
		 }
		 
	}
}
