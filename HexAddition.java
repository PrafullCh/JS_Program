import java.lang.Math;
class HexAddition 
{
	public static void main(String[] aa) 
	{
		int a = Integer.parseInt(aa[0],16);
		int b = Integer.parseInt(aa[1],16);
		int c = a+b;
		System.out.println("Addition of "+aa[0]+" and "+aa[1]+" is "+Integer.toHexString(c));
		System.out.println("Answer in decimal is "+c);
	}
}
