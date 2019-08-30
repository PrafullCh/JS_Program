class Sample{

static class InnerClass{
		static void display()
		{
			System.out.println("Inner");
		}
	}

}

class OuterClass 
{


	public static void main(String[] args) 
	{
		InnerClass.display();
		System.out.println("Hello World!");
	}
}
