class HappyNum5march24_21
{
	public static void main(String[] args) 
	{
		int num=991,c1num=num;

		  while (true)
		{
				num=Bl.digitSqrSum(num);
				 System.out.println(num+" :num in loop");
		  if (num==1 || num==4)
		  {
			  break;
		  }
		}

		  if (num==1)
		  {
			  System.out.println(c1num+" is a happy number");
		  }
		  else
		  {
			System.out.println(c1num+" is NOT a happy number");
		  }
	}
}