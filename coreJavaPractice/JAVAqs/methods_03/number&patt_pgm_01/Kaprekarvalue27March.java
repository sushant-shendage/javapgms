class Kaprekarvalue27March 
{
	public static void main(String[] args) 
	{
	  int num=1234;
	  System.out.println("given number                    :"+num);
	  System.out.println("total number of digits          :"+totalDigits(num));
	  System.out.println("0 occurence in number           :"+dCount(0,num)           );
	  System.out.println("total number of digits except 0 :"+(totalDigits(num)-dCount(0,num)));
	  System.out.println("number in asending order        :"+asendDigits(num));
	  System.out.println("number in desending order       :"+desendDigits(num)           );
	 
	 
		  kaparekarVal(num);
		   
	 
		



	}
	public static void kaparekarVal(int num)
	{
		int c1num=num;
		int count=0;
		while(count<=7)
		{
			
			num=desendDigits(num)-asendDigits(num);

			if(num<0)
			{
				num=-num;
			}
			else if (num==0||num==6174)
			{
				System.out.println("substratction break :"+num);
				break;
			}
			System.out.println("substratction  :"+num);
			count++;
			System.out.println("count  :"+count);
		}

		if(num==6174)
		{
			System.out.println(c1num+" is kaprekar constatnt  number");
		}

		//return num==6174 ;
	}


	public static int totalDigits(int num)
	{
		int total_digits=0;
		 for (int i=num;i!=0 ;i/=10 )
		 {
			total_digits++;
		 }
			return total_digits;
	}

	public static int dCount(int digit,int num)
	{
		int occ=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			
			if(i%10==digit)
			{
				occ++;
			}
		}
		return occ;
	}
	public static int asendDigits(int num)
	{
		int numA=0;
		int tD=(totalDigits(num)-dCount(0,num));
		for (int i=1;i<=9;i++ )
		{
			if(dCount(i,num)>1)
			{
				numA+=dGroup(i,dCount(i,num))*pow(10,tD-dCount(i,num));
				tD-=dCount(i,num);
			}
			else if(dCount(i,num)==1)
			{
				numA+=i*pow(10,tD-1);
				tD--;
			}
		}

		return numA;
	}
	//dese

	public static int desendDigits(int num)
	{
		 return reverse(asendDigits(num))*pow(10,dCount(0,num)); 
	} 

	 

	public static int pow(int base,int index)
	{
		int prod=1;
		for (int i=1;i<=index ;i++ )
		{
			prod*=base;
		}
		return prod;
	}

	 public static int dGroup(int digit,int occ)
	 {
		 int G=0;
		 for (int i=1;i<occ ;i++ )
		 {
			 G+=digit*pow(10,i);
		 }
		return G+digit;
	 }
	 public static int reverse(int num)
	{
		 int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+i%10;
		}
		return rev;
	}
}