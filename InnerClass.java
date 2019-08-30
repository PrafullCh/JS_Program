class Outer 
{
	static class InnerClass{
		static void display()
		{
			System.out.println("Inner");
		}
	}

	public static void main(String[] args) 
	{
		Inner.display();
		System.out.println("Hello World!");
	}
}
