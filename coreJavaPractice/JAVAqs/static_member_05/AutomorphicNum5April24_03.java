class AutomorphicNum5April24_03
{
	public static void main(String[] args) 
	{
		  int num=6;

		  if(num*num%Bl.pow(10,Bl.digitCount(num))==num)
		  {
			System.out.println(num+" is a automorphic num");
		  }
		  else
		  {
			System.out.println(num+" is NOT a automorphic num");
		  }
	}
}