class BouncyNum5April24_04 
{
	public static void main(String[] args) 
	{
		int num=123245;
		 if (Bl.digitICount(num)==Bl.digitCount(num)-1 || Bl.digitDCount(num)==Bl.digitCount(num)-1)
		 {
			 System.out.println(num+" is a bouncy number");
		 }
		else
		 {
			 System.out.println(num+" is NOT a bouncy number");
		 }
	 
	}
} 
