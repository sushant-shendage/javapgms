class AllFibDigits 
{ 
	public static void main(String[] args) 
	{
		 int num=581,count=0;
		 System.out.println("number: "+num);
		while(num>0)
		{
			int mod=num%10;
			System.out.println("mod: "+mod);
			
			if(mod!=0 && mod!=2 && mod!=1 && mod!=3 && mod!=5 && mod!=8)
			{break;
			
			 }
			  
			num/=10;

			
			
		}

		  System.out.println("number: "+num);
		if(num==0)
		{
			System.out.println("all digits are fib digits");
		}
		else
		{
			System.out.println("all digits are not fib digits");
			
		}
	}
}