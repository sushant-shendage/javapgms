
//deffecient num   sumOfDivisor>num
//abuendent num  sumOfDivisor<num
//facisnating number
/*
abcX1=abc
abcX2=def
abcX3=ghi


abcdefghi=>1-9

facinating num

*/
class  FasinatingNum
{
	public static void main(String[] args) 
	{
		int num=123;
		facinatingOrNot(123);
ss

	}
}
public static void facinatingOrNot(int num)
{
	if(facinating(num))
	{
		System.out.println(num +" is a facinating num");
	}
	else
	{
		System.out.println(num +" is NOT a facinating num");
	}
}
public static boolean facinating(int num)
{
	int cocatinatedNum=0;
    int num2=num*2,num3=num*3;
	
	int tD=count(num)+count(num2)+count(num3);

	 cocatinatedNum+=num*pow(10,count(num));
	 tD=tD-count(num);
	 cocatinatedNum+=num2*pow(10,count(num));
	 tD=tD-count(num2);
	 cocatinatedNum+=num3;

	 return asend(cocatinatedNum)==123456789;
}