import java.util.Scanner;
class If_stmt2

{
	public static void main(String[] args) 
	{
		
		boolean booleanVar1;
		Scanner ScanVar=new Scanner(System.in);

		System.out.println("Are you VIP :");
		booleanVar1=ScanVar.nextBoolean();

		if(booleanVar1)
			{
			 System.out.println("get the discount on charges");
			}
				
				
				System.out.println("pay the charges and get the room.");

		
	}
}
