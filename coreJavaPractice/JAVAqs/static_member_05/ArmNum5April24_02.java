class ArmNum5April24_02 
{
	public static void main(String[] args) 
	{
		 int num=154,sum=0;

		 int count=Bl.digitCount(num);
		 
		 for (int i=num;i!=0 ;i/=10 )
		 {
			 sum+=Bl.pow(i%10,count);
 
		 }
		  
		 if(sum==num)
		{
			System.out.println(num+" is a armstrong num");
		}
		else 
		{
			System.out.println(num+" is NOT a armstrong num");
		}
	}
}