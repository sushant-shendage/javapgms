class SumOfdigits_Method16thMarch 
{
	public static void main(String[] args) 
	{
		int num=1234;
	
		System.out.println("The sum of digit     :"+Dsum(num));
		System.out.println("The product of digit :"+Dprod(num));
		
			System.out.println("The product of digit :"+DfactorialSum(num));
	}






	public static int Dsum(int numM ){
		 int sum=0;
		 while (numM>0)
		 {
			 int mod=numM%10;
			  sum+=mod;
			 numM/=10;

			 
		 }
		 return sum;
	}

	public static int Dprod(int numM ){
		 int prod=1;
		 while (numM>0)
		 {
			 int mod=numM%10;
			  prod*=mod;
			 numM/=10;

			 
		 }
		 return prod;
	}
	public static int DfactorialSum(int numM ){
		 int fact=1;
		 int sum=0;

		 while (numM>0)
		 {
			 int mod=numM%10;
			 for (int i=1;i<=mod ;i++ )
			 {
				 fact*=i;
			 }

			 sum+=fact;
			   
			 numM/=10;

			 
		 }
		 return sum;
	}
}