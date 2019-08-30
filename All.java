class All 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		int a=x+y,b=x-y,c=x*y,d=x/y,e=x%y;

		System.out.println("Addition is "+a+"\nSubtraction is "+b+"\nMultiplication is "+c+"\nDivision is "+d+"\nRemainder is "+e);
	}
}
