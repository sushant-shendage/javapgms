class SpenicNum30march24l1w1 
{
	public static void main(String[] args) 
	{

		spenicNum(106);
	}
	public static void spenicNum(int num)
	{
		 
			 if(spenic(num))
			{
				  System.out.println(num+" is a sphenic num");
			}
			  else
			{
				System.out.println(num+" is not a sphenic num");  
			}
		
	}
	public static boolean spenic(int num)
	{
		int c1num=num,pp=1,count=0;

		for (int i=2;i<=num ;i++ )
		{
			if (num%i==0)
			{
				pp*=i;
				//System.out.println("i: "+i+" pp:"+pp); 
				num/=i;
				count++;
			}
		}

		return pp==c1num && count==3;
	}
}
//semiprime numbe program