import java.lang.Math;
class OctalAddition 
{
	public static void main(String[] aa) 
	{
		int a = Integer.parseInt(aa[0],8);
		int b = Integer.parseInt(aa[1],8);
		int c = a+b;
		System.out.println("Addition of "+aa[0]+" and "+aa[1]+" is "+Integer.toOctalString(c));
		System.out.println("Answer in decimal is "+c);
	}
}
