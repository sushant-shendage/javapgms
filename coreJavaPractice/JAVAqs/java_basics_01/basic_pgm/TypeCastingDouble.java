class TypeCastingDouble
{
	public static void main(String[] args) 
	{
		double doublevar=78.5678;

		byte bytevar;
		//bytevar=doublevar;
		/*incompatible types: possible lossy conversion 
		from double to byte*/
		 
		
		short shortvar;
		//shortvar=doublevar;
		/*incompatible types: possible lossy conversion
		from double to short*/
		 
		int intvar;
		//intvar=doublevar;
		 /* incompatible types: possible lossy conversion
		 from double to int*/

		long longvar;
		//longvar=doublevar;
		/* incompatible types: possible lossy conversion 
		from double to long*/
		 
		
		 float floatvar;
		 //floatvar=doublevar;
		 /* incompatible types: possible lossy conversion
		 from double to float*/

		char charvar;
		//charvar=doublevar;
		/* possible lossy conversion from double to char*/
		 
		boolean booleanvar;
		//booleanvar=doublevar;
		/* incompatible types: double cannot 
		be converted to boolean*/
		

		/*System.out.println("Double variable   : "+doublevar);
		
		System.out.println("Double in short   : "+shortvar);
		System.out.println("Double in int     : "+intvar);
		System.out.println("Double in long    : "+longvar);
		System.out.println("Double in byte    : "+bytevar);
		 
		System.out.println("Double in float    : "+charvar); 
		System.out.println(" double in boolean  : "+booleanvar);
		*/
	}
}