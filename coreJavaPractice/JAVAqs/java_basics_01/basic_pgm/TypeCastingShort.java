class TypeCastingShort
{
	public static void main(String[] args) 
	{
		short shortvar=56;
		
		byte bytevar;
		//bytevar=shortvar;
		/*error: incompatible types: possible lossy conversion 
			from short to byte*/

		int intvar;
		intvar=shortvar;

		long longvar;
		longvar=shortvar;

		float floatvar;
		floatvar=shortvar;

		double doublevar;
		doublevar=shortvar;

		char charvar;
		//charvar=shortvar;
		/* error: incompatible types: possible 
			 lossy conversion from short to char*/
		
		boolean booleanvar;
		//booleanvar=shortvar;
		/*error: incompatible types: short cannot be converted to boolean*/
		 

		System.out.println("short variable      : "+shortvar);
		//System.out.println("short in byte       : "+bytevar);//CTE
		System.out.println("short in int        : "+intvar);
		System.out.println("short in long       : "+longvar);
		System.out.println("short in float      : "+floatvar);
		System.out.println("short in double     : "+doublevar);
		//System.out.println("short in char     : "+charvar); 
		//System.out.println("short in boolean  : "+booleanvar);
		
	}
}
