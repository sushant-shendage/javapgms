class TypecastingNarrowing
{
	public static void main(String[] args) 
	{
		{//double to other
		double doublevar=34.567;

		byte  bytevar  =(byte) doublevar;
		short shortvar =(short)doublevar;
		int   intvar   =(int)  doublevar;
		long  longvar  =(long) doublevar;
		float floatvar =(float)doublevar;
		char  charvar  =(char) doublevar;

		System.out.println("double var :"+doublevar);

		System.out.println("doublevar to bytevar  : "+bytevar) ;
		System.out.println("doublevar to shortvar : "+shortvar);
		System.out.println("doublevar to int      : "+intvar)  ;
		System.out.println("doublevar to longtvar : "+longvar) ;
		System.out.println("doublevar to floatvar : "+floatvar);
		System.out.println("doublevar to charvar  : "+charvar) ;
		}

		{//float to other
		float floatvar=56.78f;

		byte  bytevar  =(byte) floatvar;
		short shortvar =(short)floatvar;
		int   intvar   =(int)  floatvar;
		char  charvar  =(char) floatvar;
		long longvar   =(long) floalvar;

		System.out.println("\nfloatvar :"+floatvar);

		System.out.println("floatvar to bytevar  : "+bytevar) ;
		System.out.println("floatvar to shortvar : "+shortvar);
		System.out.println("floatvar to int      : "+intvar)  ;
		System.out.println("floatvar to charvar  : "+charvar) ;
		System.out.println("floatvar to longvar  : "+longvar) ;


		}

		{//long to other
		 long longvar=312345678;

		 char  charvar =(char) longvar;
		 byte  bytevar =(byte) longvar;  
		 short shortvar=(short)longvar;
		 int   intvar  =(int)  longvar;

		System.out.println("\nlongvar :"+longvar);
		
		System.out.println("longvar to bytevar  : "+bytevar) ;
		System.out.println("longvar to shortvar : "+shortvar);
		System.out.println("longvar to int      : "+intvar)  ;
		System.out.println("longvar to charvar  : "+charvar) ;

		}

		{//int to other
			int intvar=56;

			short shortvar=(short)intvar;
			byte bytevar  =(byte) intvar;
			char charvar  =(char) intvar;

			System.out.println("\nintvar:"+intvar);

			System.out.println("intvar to shortvar : "+shortvar);
			System.out.println("intvar to bytevar  : "+bytevar);
			System.out.println("intvar to charvar  : "+charvar) ;

		}

		{//short to other
			 short shortvar=78;
			 byte bytevar=(byte)shortvar;
			 char charvar=(char)shortvar;

			System.out.println("\nshortvar:"+shortvar);

			System.out.println("shortvar to bytevar : "+bytevar);
			System.out.println("shortvar to charvar : "+charvar);
			 
		}
		{//char

			char charvar='Z';

			byte  bytevar  =(byte)  charvar;
			short shortvar =(short) charvar;

			System.out.println("\ncharvar:"+charvar);

			System.out.println("charvar to bytevar  : "+bytevar);
			System.out.println("charvar to shortvar : "+shortvar);

			
			
		}
	}
}