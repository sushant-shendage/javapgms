class SumOfDigit 
{
	public static void main(String[] args) 
	{
		 int num=1234,sum=0;

		 while(num>0)
		 {
			int numMod=num%10;

			sum=sum+numMod;
			num/=10;
		 }
		 System.out.println("sum of digits :"+sum);
	}
}
