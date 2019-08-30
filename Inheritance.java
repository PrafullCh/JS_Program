class  Super 
{
	void sample()
	{
		System.out.println("In super ");
	}
}
class Sub extends Super
{
	void sample()
	{
		System.out.println("In sub ");
	}
}

class Inheritance
{
	public static void main(String args[])
	{
		Super s = new Sub();
		s.sample();
		s = new Super();
		s.sample();
	}
}