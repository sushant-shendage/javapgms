import java.util.Scanner;
class SCanner2 
{
	public static void main(String[] args) 
	{
		Scanner ScanVar=new Scanner(System.in);

		String name ;
		String city;
		String email;
		String job;
		byte age;
		long pincode;
		
		System.out.println("Enter name :");
		 name=ScanVar.nextLine();
		System.out.println("Enter city :");
		 city=ScanVar.nextLine();
		System.out.println("Enter EmailId:");
		 email=ScanVar.next();
		System.out.println("Enter Age :");
		 age=ScanVar.nextByte();

		 System.out.println("Enter job :");
		 job=ScanVar.next();

		System.out.println("Enter city pincode :");
		 pincode=ScanVar.nextLong();

/*System.out.print("Enter the byte-integer number :");
		byte byteVar=ScanVar.nextByte();*/

		
		
		
		
		

		System.out.println("Entered Age      : "+age);
		System.out.println("Entered city     : "+city);
		System.out.println("Entered job      : "+job);
		System.out.println("Entered pincode  : "+pincode);
		System.out.println("Entered EmailId  : "+email);


	}
}
