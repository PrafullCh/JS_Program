class  TypeConversion
{
	void autoTypeConversion()
	{
	    //  float to double 
		float f = 0.56f;
		double d=f;
		// short to int 
		short s=4; 
		int i=s;
		// int to long 
		int ii = 67;
		long l=ii;

		System.out.println(" float to double "+d);
		System.out.println(" short to int  "+i);
		System.out.println(" int to long  "+l);
	}
	void manualTypeConversion()
	{
	    float f = 6f;
		double d= (double) f;
	}
	void literalOfInteger()
	{
		int cc=5,dd=2;
		int a  = cc/dd;
		int b= 010;
		int c=0x876;
		System.out.println(" decimal "+a);
		System.out.println(" octal  "+b);
		System.out.println(" hex  "+c);
	}
	void array()
	{
		int [] a= {12,34,454,56523,2331,545};
		for(int i:a)
			System.out.println(i);
	}
	public static void main(String[] args) 
	{

		TypeConversion o = new TypeConversion();
		o.literalOfInteger();
	}
}
